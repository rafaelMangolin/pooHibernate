package Controle;

import Modelo.Pessoa;
import Modelo.Secretaria;
import Modelo.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleSecretaria extends ControleUsuario {

    @Override
    public Pessoa salvar(Pessoa pessoa) {
        Secretaria secretaria = (Secretaria) super.salvar(pessoa);
        if (secretaria != null) {
            if (secretaria.getId() == null && this.repositorio.salvar(secretaria)) {
                JOptionPane.showMessageDialog(null, "Cadastro salvo com Sucesso");
            }
        }
        return secretaria;
    }

    @Override
    public Pessoa buscaPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario buscaPorLogin(String valor) {
        return super.buscaPorUsuario(valor, new ArrayList<>(this.repositorio.pegarValoresSecretaria()));
    }
}
