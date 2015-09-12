package Controle;

import Modelo.Consulta;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Prontuario;
import Modelo.Secretaria;
import Repositorio.Repositorio;
import clinica.UnidadePersistencia;
import java.util.Collection;
import javax.persistence.EntityManager;


public class ControleRepositorio {

    private final EntityManager em = UnidadePersistencia.getEntityManager();;


//    Metodos de acesso ao medico
    public Boolean salvar(Medico entidade) {
        em.getTransaction().begin();
        em.persist(entidade);
//        entidade = em.merge(entidade);
        em.getTransaction().commit();
        return entidade != null;
    }
    public Medico buscarMedicoPorId(Integer chave) {
//        return this.repositorioMedico.pegarPorId(chave);
        return null;
    }
    public Collection<Medico> pegarValoresMedico(){
        return null;
//        return this.repositorioMedico.pegarRepositorio();
    }
    public Boolean removerMedico(Integer id) {
//        return this.repositorioMedico.remover(id);
        return null;
    }


//    Metodos de acesso a secretaria
    public Boolean salvar(Secretaria entidade) {
        em.getTransaction().begin();
        em.persist(entidade);
//        entidade = em.merge(entidade);
        em.getTransaction().commit();
        return entidade != null;
    }
    public Secretaria buscarSecretariaPorId(Integer chave) {
//        return this.repositorioSecretaria.pegarPorId(chave);
        return null;
    }
    public Collection<Secretaria> pegarValoresSecretaria(){
//        return this.repositorioSecretaria.pegarRepositorio();
        return null;
    }
    public Boolean removerSecretaria(Integer id) {
//        return this.repositorioSecretaria.remover(id);
        return null;
    }


//    Metodos de acesso ao paciente
    public Boolean salvar(Paciente entidade) {
        em.getTransaction().begin();
        em.persist(entidade);
//        entidade = em.merge(entidade);
        em.getTransaction().commit();
        return entidade != null;
    }
    public Paciente buscarPacientePorId(Integer chave) {
//        return this.repositorioPaciente.pegarPorId(chave);
        return null;
    }
    public Collection<Paciente> pegarValoresPaciente(){
//        return this.repositorioPaciente.pegarRepositorio();
        return null;
    }
    public Boolean removerPaciente(Integer id) {
//        return this.repositorioPaciente.remover(id);
        return null;
    }


//    Metodos de acesso a Consulta
    public Boolean salvar(Consulta entidade) {
        em.getTransaction().begin();
        em.persist(entidade);
//        entidade = em.merge(entidade);
        em.getTransaction().commit();
        return entidade != null;
    }
    public Consulta buscarConsultaPorId(Integer chave) {
//        return this.repositorioConsulta.pegarPorId(chave);
        return null;
    }
    public Collection<Consulta> pegarValoresConsulta(){
//        return this.repositorioConsulta.pegarRepositorio();
        return null;
    }
    public Boolean removerConsulta(Integer id) {
//        return this.repositorioConsulta.remover(id);
        return null;
    }
}
