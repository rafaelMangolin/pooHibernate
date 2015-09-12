package Modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Prontuario extends Entidade{
   
    private List<String> sintoma;
    @Column(nullable = false)
    private String diagnostico;
    @Column(nullable = false)
    private String tratamento;
    @ManyToOne
    private Paciente paciente;
    
    public Prontuario(List<String> sintoma, String diagnostico, String tratamento) {
        this.sintoma = sintoma;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }
    public Prontuario(){
        
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<String> getSintoma() {
        return sintoma;
    }

    public void setSintoma(List<String> sintoma) {
        this.sintoma = sintoma;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
   
}
