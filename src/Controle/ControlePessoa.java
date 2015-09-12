package Controle;

import Modelo.Entidade;
import Modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public abstract class ControlePessoa extends ControleEntidade {
    
    public Pessoa salvar(Pessoa pessoa) {
        if (pessoa != null) {
            if (pessoa.getNome().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor digite o nome.");
                return null;
            } else if (pessoa.getSobrenome().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor digite o sobrenome.");
                return null;
            } else if (pessoa.getTelefoneFixo().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Por favor digite o telefone fixo.");
                return null;
            }
            else if (pessoa.getCpf().equals("   .   .   -  ")) {
                JOptionPane.showMessageDialog(null, "Por favor digite o CPF.");
                return null;
            }
        }
        return pessoa;
    }

    public abstract Pessoa buscaPorNome(String nome);
    
  
}
