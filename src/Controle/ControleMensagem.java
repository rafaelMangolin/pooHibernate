package Controle;

import Modelo.Consulta;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ControleMensagem {

    private final ControleConsulta controleConsulta = new ControleConsulta();

    public void enviarMensagens(Date data){
        List<Consulta> valores = controleConsulta.buscarPorData(data);
        
        
        for(Consulta c:valores){
            String mensagem = "";
                mensagem = "Você tem consulta amanhã com o médico "
                        +c.getMedico().getNome()
                        +"as "+c.getHora()
                        + ".\n";                      
            if(c.getPaciente().getEmail() != null){
                enviarEmail(c.getPaciente().getEmail(), mensagem);
            }
            if(c.getPaciente().getTelefoneCelular() != null){
                enviarSms(c.getPaciente().getEmail(), mensagem);
            }
        }
    }
    
    private Boolean enviarSms(String cel,String mensagem){
        JOptionPane.showMessageDialog(null, "Mensagem:\n\""+mensagem+"\"\nPara o celular:"+cel);
        return true;
    }
    
    private Boolean enviarEmail(String email,String mensagem){
        JOptionPane.showMessageDialog(null, "Mensagem:\n\""+mensagem+"\"\nPara o email:"+email);
        return true;
    } 
}
