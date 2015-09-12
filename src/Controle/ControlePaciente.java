package Controle;

import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Pessoa;
import Modelo.Prontuario;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlePaciente extends ControlePessoa{
    
    @Override
    public Pessoa salvar(Pessoa pessoa) {
        Paciente paciente = (Paciente) super.salvar(pessoa);
        if (paciente != null) {
            if (paciente.getId()== null && this.repositorio.salvar(paciente)) {
                JOptionPane.showMessageDialog(null, "Cadastro salvo com Sucesso");
            }
        }
        return paciente;
    }

    @Override
    public Pessoa buscaPorNome(String nome) {
        List<Paciente> valores = new ArrayList<>(repositorio.pegarValoresPaciente());
        for(int i = 0;i< valores.size();i++){
            Pessoa p = valores.get(i);
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }

    public Paciente buscar(String tipo,String chave) {
        if(tipo.equals("Nome")){
            return (Paciente)buscaPorNome(chave);
        }
        return repositorio.buscarPacientePorId(Integer.parseInt(chave));
    }
    
    public Boolean remover(Integer id) {
        return this.repositorio.removerMedico(id);
    }
    
    public void adicionarProntuario(Prontuario prontuario,Paciente pacienteBusca){
        pacienteBusca.getProntuario().add(prontuario);
        JOptionPane.showMessageDialog(null, "Prontuário cadastrado com sucesso!");
    }
    
    public List<Prontuario> listarProntuario(Paciente paciente){
        return paciente.getProntuario();
    }
    
    public void ExcluiProntuario(Prontuario prontuario, Paciente paciente){
        paciente.getProntuario().remove(prontuario);
        JOptionPane.showMessageDialog(null, "Prontuário removido com sucesso");
    }
        
    
}
