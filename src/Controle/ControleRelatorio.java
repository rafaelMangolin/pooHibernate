package Controle;

import Visao.FolhaRelatorio;

public class ControleRelatorio {
    String nomeRelatorio;
    String texto;

    public ControleRelatorio() {
    }
    public ControleRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
    
    public String pegaNomeRelatorio(){
        return this.nomeRelatorio;
    }
    
    //sobrecarga
    public void formataRelatorio(String nomePaciente,String data, String dias,String motivo) {
        this.texto = 
                "Declaro que o Sr.(a) " + nomePaciente + ", paciente sob meus cuidados, "
                + "não se encontra \n em condições para o trabalho por motivo " + motivo + ", "
                + "devendo ser afastado por " + dias + "dias apartir de" + data + ".\n\n\n"+
                "______________________________________\n"+"Assinatura do médico";
    }
    
    public void formataRelatorio(String nomePaciente,String descricao) {
        this.texto = descricao+"\n\nPaciente:" +nomePaciente+"\n\n"+"______________________________________\n"+"Assinatura do médico";
    }
    
    public void formataRelatorio(String nomePaciente,String acompanhante,String motivo) {
        this.texto = "Declaro que o paciente "+nomePaciente+" por motivo de "+motivo+""
                + ", precisou ser acompanhado por"+acompanhante+
                "\n\n\n"+"______________________________________\n"+"Assinatura do médico";
    
    }
    
    public void geraRelatorio(){
        FolhaRelatorio folha = new FolhaRelatorio(this.texto);
        folha.setVisible(true);
    }
}
