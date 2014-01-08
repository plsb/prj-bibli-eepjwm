/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fvsosp.exemplaremprestimos;

import fvsosp.emprestimo.Emprestimo;
import fvsosp.exemplar.Exemplar;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CollectionId;

/**
 *
 * @author Pedro Saraiva
 */
@Entity
@Table(name="exemplaremprestimos")
public class ExemplarEmprestimos implements Serializable , Comparable<ExemplarEmprestimos> {
    
    @Override
    public String toString() {
        return "Tombo: "+getExemplar().getTombo()+" Nº exemplar =" + getExemplar().getExemplar();
    }
    
    @Override
    public int compareTo(ExemplarEmprestimos o) {
        Short exemplar2 = getIdExemplarEmprestimos();;
        Short exemplarO2 = o.getIdExemplarEmprestimos();
        return exemplar2.compareTo(exemplarO2);            
    }
    
    @Id
    @GeneratedValue
    private short idExemplarEmprestimos;
    
    @ManyToOne
    @JoinColumn(name="idEmprestimo")
    private Emprestimo emprestimo;
    
    @ManyToOne
    @JoinColumn(name="idExemplar")
    private Exemplar exemplar;
    @Temporal(TemporalType.DATE)
    private Date dataEmprestimo;
    @Temporal(TemporalType.DATE)
    private Date dataDevolucao;
    @Temporal(TemporalType.DATE)
    private Date dataPrevistaDevolucao;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idExemplarEmprestimos;
        hash = 97 * hash + Objects.hashCode(this.emprestimo);
        hash = 97 * hash + Objects.hashCode(this.exemplar);
        hash = 97 * hash + Objects.hashCode(this.dataEmprestimo);
        hash = 97 * hash + Objects.hashCode(this.dataDevolucao);
        hash = 97 * hash + Objects.hashCode(this.dataPrevistaDevolucao);
        hash = 97 * hash + this.operacao;
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
        final ExemplarEmprestimos other = (ExemplarEmprestimos) obj;
        if (this.idExemplarEmprestimos != other.idExemplarEmprestimos) {
            return false;
        }
        if (!Objects.equals(this.emprestimo, other.emprestimo)) {
            return false;
        }
        if (!Objects.equals(this.exemplar, other.exemplar)) {
            return false;
        }
        if (!Objects.equals(this.dataEmprestimo, other.dataEmprestimo)) {
            return false;
        }
        if (!Objects.equals(this.dataDevolucao, other.dataDevolucao)) {
            return false;
        }
        if (!Objects.equals(this.dataPrevistaDevolucao, other.dataPrevistaDevolucao)) {
            return false;
        }
        if (this.operacao != other.operacao) {
            return false;
        }
        return true;
    }

    
    
    
    /*
     * 1 - Emprestado
     * 2 - Devolvido
     * 3 - Renovado
     */
    private int operacao;
    
    public String descricaoOperacao(){
        if(getOperacao()==1){
            return "Emprestado";
        } else if (getOperacao()==2){
            return "Devolvido";
        } else if(getOperacao()==3){
            return "Renovado";
        }
        return "";
    }

    /**
     * @return the idExemplarEmprestimos
     */
    public short getIdExemplarEmprestimos() {
        return idExemplarEmprestimos;
    }

    /**
     * @param idExemplarEmprestimos the idExemplarEmprestimos to set
     */
    public void setIdExemplarEmprestimos(short idExemplarEmprestimos) {
        this.idExemplarEmprestimos = idExemplarEmprestimos;
    }

    /**
     * @return the emprestimo
     */
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    /**
     * @param emprestimo the emprestimo to set
     */
    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    /**
     * @return the exemplar
     */
    public Exemplar getExemplar() {
        return exemplar;
    }

    /**
     * @param exemplar the exemplar to set
     */
    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    /**
     * @return the operacao
     */
    public int getOperacao() {
        return operacao;
    }

    /**
     * @param operacao the operacao to set
     */
    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    /**
     * @return the dataEmprestimo
     */
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * @param dataEmprestimo the dataEmprestimo to set
     */
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * @return the dataDevolucao
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the dataPrevistaDevolucao
     */
    public Date getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    /**
     * @param dataPrevistaDevolucao the dataPrevistaDevolucao to set
     */
    public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }
    
    
    
}
