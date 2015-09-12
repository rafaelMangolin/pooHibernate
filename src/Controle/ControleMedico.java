package Controle;

import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Pessoa;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ControleMedico extends ControleUsuario {

    @Override
    public Pessoa salvar(Pessoa pessoa) {
        Medico medico = (Medico) super.salvar(pessoa);
        if (medico != null) {
            if (medico.getCrm().equals("")) {
                JOptionPane.showMessageDialog(null,"Por favor digite o CRM.");
                return null;
            } else if (medico.getEspecializacao().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor digite a Especialização.");
                return null;
            }
            if(this.repositorio.salvar(medico)){
                JOptionPane.showMessageDialog(null,"Cadastro salvo com Sucesso");
            }
        }
        return medico;
    }

    public Medico buscar(String tipo,String chave) {
        if(chave != null){
            if(tipo.equals("Nome")){
                return (Medico) buscaPorNome(chave);
            }
            return (Medico)repositorio.buscarMedicoPorId(Integer.parseInt(chave));
        }
        return null;
    }
    
    public Usuario buscaPorLogin(String valor){
        return super.buscaPorUsuario(valor,new ArrayList<>(this.repositorio.pegarValoresMedico()));

    }

    @Override
    public Pessoa buscaPorNome(String nome) {
        List<Medico> valores = new ArrayList<>(repositorio.pegarValoresMedico());
        for(int i = 0;i< valores.size();i++){
            Medico m = valores.get(i);
            if(m.getNome().toLowerCase().equals(nome.toLowerCase())){
                return m;
            }
        }
        return null;
    }
}
