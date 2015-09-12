package Controle;

import Modelo.Entidade;
import Modelo.Pessoa;
import Modelo.Usuario;
import Visao.Login;
import Visao.MenuPrincipal;
import javax.swing.JOptionPane;

public class ControleLogin {

    private Usuario user;
    private ControleMedico controleMedico = new ControleMedico();
    private ControleSecretaria controleSecretaria = new ControleSecretaria();

    public ControleLogin() {
    }

    public Usuario validaLogin(String usuario, String senha) {
        Usuario aux;
        aux = controleMedico.buscaPorLogin(usuario);
        if (aux == null) {
            if ((aux = controleSecretaria.buscaPorLogin(usuario)) == null) {
                JOptionPane.showMessageDialog(null, "Usuário não existente. Por favor entre com um usuário válido");
                return null;
            }
            
        } 
        
        if (aux !=null){
            if (!aux.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Senha inválida. Por favor digite uma senha válida!");
                return null;
            }
        }
        return aux;
    }

}
