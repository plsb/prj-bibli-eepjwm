package fvsosp.emprestimo;

import fvsosp.acervo.Acervo;
import fvsosp.exemplar.Exemplar;
import fvsosp.leitor.Leitor;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "emprestimo")
public class Emprestimo implements Serializable {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.idEmprestimo;
        hash = 53 * hash + Objects.hashCode(this.dataEmprestimo);
        hash = 53 * hash + Objects.hashCode(this.dataDevolucao);
        hash = 53 * hash + Objects.hashCode(this.exemplares);
        hash = 53 * hash + Objects.hashCode(this.leitor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emprestimo other = (Emprestimo) obj;
        if (this.idEmprestimo != other.idEmprestimo) {
            return false;
        }
        if (!Objects.equals(this.dataEmprestimo, other.dataEmprestimo)) {
            return false;
        }
        if (!Objects.equals(this.dataDevolucao, other.dataDevolucao)) {
            return false;
        }
        if (!Objects.equals(this.exemplares, other.exemplares)) {
            return false;
        }
        if (!Objects.equals(this.leitor, other.leitor)) {
            return false;
        }
        return true;
    }
    @Id // campo chave primária
    @GeneratedValue // campo auto-incremento
    private short idEmprestimo;
    @Temporal(TemporalType.DATE) // ignora horas e minutos e persiste apenas a data
    private Date dataEmprestimo;
    @Temporal(TemporalType.DATE) // ignora horas e minutos e persiste apenas a data
    private Date dataDevolucao;

    /*
     * Um emprestimo possui muitos acervos, e um acervo possui 
     * muitos emprestimo, no caso será criada uma nova tabela chamada
     * AcervoEmprestimos, que possuirá a chave primaria de emprestimo
     * e a chave primaria de acervo
     * O CascadaType.ALL quer dizer que ao excluir um emprestimo,
     * todos os itens da tabela acervoemprestimos que façam referência 
     * ao emprestimo excluído será deletado também
     */
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "ExemplarEmprestimos",
            joinColumns =
            @JoinColumn(name = "idEmprestimo"),
            inverseJoinColumns =
            @JoinColumn(name = "idExemplar"))
    private Set<Exemplar> exemplares = new HashSet<>();
    /*set não aceita valores duplicados, 
     * ou seja um mesmo livro não poderá ser emprestado ao 
     * mesmo emprestimo
     */

    /*um emprestimo tem apenas um leitor
     * a chave estrangeira irá se chamar idLeitor
     */
    @ManyToOne
    @JoinColumn(name = "idLeitor")
    private Leitor leitor;

    /**
     * * @retorna o id do Empréstimo **
     */
    public short getIdEmprestimo() {
        return idEmprestimo;
    }

    /**
     * * @seta o id do Empréstimo **
     */
    public void setIdEmprestimo(short idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    /**
     * * @retorna a Data do Empréstimo **
     */
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * * @seta a Data do Empréstimo **
     */
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * * @retorna a Data de Devolução **
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * * @seta a Data de Devolução **
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * * @retorna a lista de Exemplares **
     */
    public Set<Exemplar> getExemplares() {
        return exemplares;
    }

    /**
     * * @seta e copia a lista de Acervos recebida para a lista de Acervos da
     * Classe **
     */
    public void setExemplares(Set<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    /**
     * * @retorna o Leitor **
     */
    public Leitor getLeitor() {
        return leitor;
    }

    /**
     * * @seta o Leitor **
     */
    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }
    private static final long serialVersionUID = -326568673743692245L;
}