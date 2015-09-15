package Controle;

import Modelo.Consulta;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Secretaria;
import clinica.UnidadePersistencia;
import java.util.Collection;
import javax.persistence.EntityManager;
import org.eclipse.persistence.sessions.Session;

public class ControleRepositorio {

    private final EntityManager em = UnidadePersistencia.getEntityManager();

//    Metodos de acesso ao medico
    public Boolean salvar(Medico entidade) {
        em.getTransaction().begin();
        if (entidade.getId() == null) {
            em.persist(entidade);
        } else {
            entidade = em.merge(entidade);
        }
        em.getTransaction().commit();
        return entidade.getId() != null;
    }

    public Medico buscarMedicoPorId(Integer chave) {
        em.getTransaction().begin();
        Medico toReturn = em.find(Medico.class, chave);
        em.getTransaction().commit();
        return toReturn;
    }

    public Collection<Medico> pegarValoresMedico() {
        em.getTransaction().begin();
        Collection<Medico> toReturn = em.createQuery("select a FROM Medico a",Medico.class).getResultList();        
        em.getTransaction().commit();
        return toReturn;
   }

    public Boolean removerMedico(Integer id) {
        em.getTransaction().begin();
        Medico toRemove = em.find(Medico.class, id);
        Boolean toReturn = toRemove != null;
        em.remove(toRemove);
        em.getTransaction().commit();
        return toReturn;
    }

//    Metodos de acesso a secretaria
    public Boolean salvar(Secretaria entidade) {
        em.getTransaction().begin();
        if (entidade.getId() == null) {
            em.persist(entidade);
        } else {
            entidade = em.merge(entidade);
        }
        em.getTransaction().commit();
        return entidade.getId() != null;
    }

    public Secretaria buscarSecretariaPorId(Integer chave) {
        em.getTransaction().begin();
        Secretaria toReturn = em.find(Secretaria.class, chave);
        em.getTransaction().commit();
        return toReturn;
    }

    public Collection<Secretaria> pegarValoresSecretaria() {
        em.getTransaction().begin();
        String query = "select a.LOGIN, a.SENHA, m.CRM, m.ESPECIALIZACAO,"
                + "p.CPF,p.DATANASCIMENTO,p.EMAIL,p.ENDERECO,p.NOME,p.RG,"
                + "p.SOBRENOME,p.TELEFONECELULAR,p.TELEFONEFIXO,e.ENTIDADE_ID "
                + "from APP.MEDICO as m,APP.USUARIO as a,APP.PESSOA as p,APP.ENTIDADE as e "
                + "where m.USUARIO_ID = a.PESSOA_ID "
                + "and a.PESSOA_ID = p.ENTIDADE_ID "
                + "and p.ENTIDADE_ID = e.ENTIDADE_ID ";
        Collection<Secretaria> toReturn = em.createNativeQuery(query, Secretaria.class).getResultList();
        em.getTransaction().commit();
        return toReturn;
    }

    public Boolean removerSecretaria(Integer id) {
        em.getTransaction().begin();
        Secretaria toRemove = em.find(Secretaria.class, id);
        Boolean toReturn = toRemove != null;
        em.remove(toRemove);
        em.getTransaction().commit();
        return toReturn;
    }

//    Metodos de acesso ao paciente
    public Boolean salvar(Paciente entidade) {
        em.getTransaction().begin();
        if (entidade.getId() == null) {
            em.persist(entidade);
        } else {
            entidade = em.merge(entidade);
        }
        em.getTransaction().commit();
        return entidade.getId() != null;
    }

    public Paciente buscarPacientePorId(Integer chave) {
        em.getTransaction().begin();
        Paciente toReturn = em.find(Paciente.class, chave);
        em.getTransaction().commit();
        return toReturn;
    }

    public Collection<Paciente> pegarValoresPaciente() {
        String query = "select pa.ALERGIAS,pa.BEBE,pa.CIRURGIAS,pa.COLESTEROL,"
                + "pa.CONVENIO,pa.DIABETES,pa.DOENCASCARDIACAS,pa.FUMA,p.CPF,"
                + "p.DATANASCIMENTO,p.EMAIL,p.ENDERECO,p.NOME,p.RG,p.SOBRENOME,"
                + "p.TELEFONECELULAR,p.TELEFONEFIXO,e.ENTIDADE_ID "
                + "from APP.PACIENTE as pa,APP.PESSOA as p,APP.ENTIDADE as e "
                + "where pa.PESSOA_ID = p.ENTIDADE_ID and p.ENTIDADE_ID = e.ENTIDADE_ID";
        Collection<Paciente> toReturn = em.createNativeQuery(query, Paciente.class).getResultList();
        em.getTransaction().commit();
        return toReturn;

    }

    public Boolean removerPaciente(Integer id) {
        em.getTransaction().begin();
        Secretaria toRemove = em.find(Secretaria.class, id);
        Boolean toReturn = toRemove != null;
        em.remove(toRemove);
        em.getTransaction().commit();
        return toReturn;
    }

//    Metodos de acesso a Consulta
    public Boolean salvar(Consulta entidade) {
        em.getTransaction().begin();
        if (entidade.getId() == null) {
            em.persist(entidade);
        } else {
            entidade = em.merge(entidade);
        }
        em.getTransaction().commit();
        return entidade.getId() != null;
    }

    public Consulta buscarConsultaPorId(Integer chave) {
        em.getTransaction().begin();
        Consulta toReturn = em.find(Consulta.class, chave);
        em.getTransaction().commit();
        return toReturn;
    }

    public Collection<Consulta> pegarValoresConsulta() {
        String query = "select c.\"DATA\",c.HORA,c.TIPO,e.ENTIDADE_ID "
                + "from APP.CONSULTA as c,APP.ENTIDADE as e "
                + "where c.ENTIDADE_ID = e.ENTIDADE_ID";
        Collection<Consulta> toReturn = em.createNativeQuery(query, Paciente.class).getResultList();
        em.getTransaction().commit();
        return toReturn;
    }

    public Boolean removerConsulta(Integer id) {
        em.getTransaction().begin();
        Consulta toRemove = em.find(Consulta.class, id);
        Boolean toReturn = toRemove != null;
        em.remove(toRemove);
        em.getTransaction().commit();
        return toReturn;
    }
}
