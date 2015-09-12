package Controle;

import Modelo.Medico;
import Modelo.Pessoa;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public abstract class ControleUsuario extends ControlePessoa {
    /**
     *
     * @param medico
     * @return
     */
    @Override
    public Pessoa salvar(Pessoa pessoa) {
        Usuario usuario = (Usuario) super.salvar(pessoa);
        if (usuario != null) {
            if (usuario.getLogin().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor digite o login.");
                return null;
            } else if (usuario.getSenha().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor digite a senha.");
                return null;
            }
        }
        return usuario;
    }

    protected Usuario buscaPorUsuario(String usuario,List<Usuario> valores) {
        for (int i = 0; i < valores.size(); i++) {
            Usuario user = valores.get(i);
            if (user.getLogin().equals(usuario)) {
                return user;
            }
        }
        return null;
    }

}
