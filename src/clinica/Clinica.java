package clinica;

import Controle.ControleMedico;
import Controle.ControlePaciente;
import Controle.ControleSecretaria;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Secretaria;
import Visao.Login;
import java.time.Instant;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.swing.SwingUtilities;

public class Clinica {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ControleMedico controleMedico = new ControleMedico();
                ControlePaciente controlePaciente = new ControlePaciente();
                ControleSecretaria controleSecretaria = new ControleSecretaria();
                
                EntityManager em = null;
                
                em = UnidadePersistencia.getEntityManager();
                
                Paciente paciente = new Paciente("Unimed", true, true, true, true, false, "", "", "João", "Silva", Date.from(Instant.now()), "(44) 3333-3333", "(44) 9999-9999", "email@email.com", "Rua da Saudade", "152.092.179-50", "00000000-1");
                Medico medico = new Medico("1", "1", "1", "1", "Munif", "Jebara", Date.from(Instant.now()), "(44) 8403-0000", "(44) 8403-4939", "munif@gebaara.com", "Rua Marista", "152.092.179-50", "00000000-1");
                Secretaria secretaria = new Secretaria("0", "0", "Matheus", "Truco", Date.from(Instant.now()), "telefoneFixo", "telefoneCelular", "email", "endereco", "cpf", "rg");
                
                em.getTransaction().begin();
            
                em.persist(paciente);
                em.persist(medico);
                em.persist(secretaria);

                em.getTransaction().commit();

                Login tela = new Login();

                tela.setVisible(true);
            }
        });
    }

}
