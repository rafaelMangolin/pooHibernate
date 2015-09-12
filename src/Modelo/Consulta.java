package Modelo;

import Util.DataHoraUtil;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consulta extends Entidade{
    @Temporal(value=TemporalType.DATE)
    private Date data;
    @Column(nullable = false)
    private String hora;
    @JoinColumn(nullable = false)
    @ManyToOne
    private Medico medico;
    @JoinColumn(nullable = false)
    @ManyToOne
    private Paciente paciente;
    @Column(nullable = false)
    private String tipo;

    public Consulta() {
    }

    public Consulta(Date data, String hora, Medico medico, Paciente paciente, String tipo) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return medico.getNome() + "     " + paciente.getNome() + "      "+hora +"      "+DataHoraUtil.dateToString(data)+"      "+tipo+"\n";
    }    
}
