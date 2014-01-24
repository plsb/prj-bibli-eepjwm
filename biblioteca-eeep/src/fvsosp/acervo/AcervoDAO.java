/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fvsosp.acervo;

import fvsosp.autor.Autor;
import fvsosp.biblioteca.Biblioteca;
import fvsosp.editora.Editora;
import fvsosp.sessao.Sessao;
import fvsosp.tipoitem.TipoItem;
import fvsosp.util.GenericDAO;
import fvsosp.util.HibernateUtil;
import java.util.*;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.criterion.*;

/**
 *
 * @author Oziel
 */
public class AcervoDAO extends GenericDAO<Acervo> {

    public AcervoDAO() {
        super(Acervo.class);
    }

    public List<Acervo> pesquisarTitulodaObra(String titulo) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.ilike("tituloObra", titulo, MatchMode.ANYWHERE)).addOrder(Order.asc("tituloObra")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar o Título. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public Acervo pesquisarTitulodaObraEq(String titulo) {
        Acervo acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (Acervo) getSessao().createCriteria(Acervo.class).add(Restrictions.eq("tituloObra", titulo)).addOrder(Order.asc("tituloObra")).uniqueResult();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar o Título. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisarSubTitulodaObra(String subtitulo) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.ilike("subtituloObra", subtitulo, MatchMode.ANYWHERE)).addOrder(Order.asc("subtituloObra")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar o Sub-Título. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisarIsbn(String isbns) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.ilike("isbn", isbns, MatchMode.ANYWHERE)).addOrder(Order.asc("isbn")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar o isbn. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisarVolume(String volumes) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.ilike("volume", volumes, MatchMode.ANYWHERE)).addOrder(Order.asc("volume")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar o Volume. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisarEdicao(String edicoes) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.ilike("edicao", edicoes, MatchMode.ANYWHERE)).addOrder(Order.asc("edicao")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar a Edição. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisaranoEdicao(short anos) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.eq("anoEdicao", anos)).addOrder(Order.asc("anoEdicao")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar o Ano de Edição. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisarInformacoesAdicionais(String informacoes) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.ilike("informacoesAdicionais", informacoes, MatchMode.ANYWHERE)).addOrder(Order.asc("informacoesAdicionais")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar as Informações Adicionais. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisarLocalizacao(String localizacoes) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.ilike("localizacao", localizacoes, MatchMode.ANYWHERE)).addOrder(Order.asc("localizacoes")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar a Localização. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisarTipoItem(TipoItem tipoitem) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.eq("tipoitem", tipoitem)).addOrder(Order.asc("idtipoitem")).addOrder(Order.asc("tipoitem")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar o Tipo do Item. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisarAutor(Autor autor) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.eq("autor", autor)).addOrder(Order.asc("autor")).addOrder(Order.asc("idautor")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar o Autor. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    /**
     * @param query
     * @return Lista de Acervos que contenham a query(Autor) 
     */
    public List pesquisarAutorQuery(String query) {
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            SQLQuery querySQL = getSessao().createSQLQuery(query);
            return querySQL.list();
        } catch (HibernateException e) {
            System.out.println("Erro ao consultar por Autor. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return null;
    }

    public List<Acervo> pesquisarEditora(Editora editora) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.eq("editora", editora)).addOrder(Order.asc("editora")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar a Editora. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public List<Acervo> pesquisarSessao(Sessao sessao) {
        List<Acervo> acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (List<Acervo>) getSessao().createCriteria(Acervo.class).add(Restrictions.eq("sessao", sessao)).addOrder(Order.asc("sessao")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar a Sessão. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    public Acervo pesquisarBiblioteca(Biblioteca biblioteca) {
        Acervo acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            acervo = (Acervo) getSessao().createCriteria(Acervo.class).add(Restrictions.eq("biblioteca", biblioteca)).addOrder(Order.asc("biblioteca")).list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar a Biblioteca. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    /**
     * @param query
     * @return Lista de Acervos que contenham a query(PalavraChave) 
     */
    public List pesquisarPalavrasChavesQuery(String query) {
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            SQLQuery querySQL = getSessao().createSQLQuery(query);
            return querySQL.list();
        } catch (HibernateException e) {
            System.out.println("Erro ao consultar por Palavras Chaves. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return null;
    }

    /**
     * @param codigo
     * @return Acervo
     */
    public Acervo pesquisarCodigo(short codigo) {
        Acervo acervo = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());

            acervo = (Acervo) getSessao().createCriteria(Acervo.class).
                    add(Restrictions.eq("idAcervo", codigo)).uniqueResult();

        } catch (HibernateException e) {
            System.out.println("Erro ao procurar por código: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return acervo;
    }

    /**
     * @return Lista de Acervos
     */
    public List relatorioAcervo() {
        String text = "select ac.idAcervo, "
                + "ac.tituloObra, "
                + "ci.descricao, "
                + "ed.nome, "
                + "ac.anoEdicao, "
                + "au.nome, "
                + "(select count(*) from exemplar exe "
                + "		where exe.idacervo=2 and ativo=true ) as qtdexemplares, "
                + "(select count(*) from exemplar exe "
                + "		inner join exemplaremprestimos exeemp "
                + "					on exeemp.idExemplar=exe.tombo "
                + "		where exe.idacervo=2) as qtdemprestimos, "
                + "(select count(*) from exemplar exe "
                + "		where exe.idacervo=ac.idAcervo and exe.situacao=3 and ativo=true) as qtdexemplaresemprestados, "
                + "(select count(*) from exemplar exe "
                + "		where exe.idacervo=ac.idAcervo and exe.situacao=4 and ativo=true) as qtdexemplaresconsulta "
                + "from acervo ac "
                + "inner join editora ed on ed.ideditora=ac.ideditora "
                + "inner join cidade ci on ci.idCidade=ed.idcidade "
                + "inner join autoresacervo ae on ae.idAcervo=ac.idAcervo "
                + "inner join autor au on au.idAutor=ae.idAutor;";
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            SQLQuery query = getSessao()
                    .createSQLQuery("select * from acervo ac ").addEntity("acervo", Acervo.class);
            //query.addEntity(Acervo.class


            return query.list();
        } catch (HibernateException e) {
            System.out.println("Erro ao localizar o Acervo. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return null;
    }

    /**
     * @param query
     * @return Lista de Acervos que contenham a query
     */
    public List consultaAcervo(String query) {
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            SQLQuery querySQL = getSessao().createSQLQuery(query).addEntity(Acervo.class);
            return querySQL.list();
        } catch (HibernateException e) {
            System.out.println("Erro ao consultar por Acervo. Erro: " + e.getMessage());
        } finally {
            this.getSessao().close();
        }
        return null;
    }
}