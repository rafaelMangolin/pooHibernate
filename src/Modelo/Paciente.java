package Modelo;

import com.sun.istack.internal.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
//@DiscriminatorValue("PESSOA_TIPO")
public class Paciente extends Pessoa{
    @NotNull
    private String convenio;
    private Boolean fuma;
    private Boolean bebe;
    private Boolean diabetes;
    private Boolean colesterol;
    private Boolean doencasCardiacas;
    private String cirurgias;
    private String alergias;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "paciente")
    private List<Prontuario> prontuario;

    public Paciente() {
    }

    public Paciente(String convenio, Boolean fuma, Boolean bebe, Boolean diabetes, Boolean colesterol, Boolean doencasCardiacas, String cirurgias, String alergias, String nome, String sobrenome, Date dataNascimento, String telefoneFixo, String telefoneCelular, String email, String endereco, String cpf, String rg) {
        super(nome, sobrenome, dataNascimento, telefoneFixo, telefoneCelular, email, endereco, cpf, rg);
        this.convenio = convenio;
        this.fuma = fuma;
        this.bebe = bebe;
        this.diabetes = diabetes;
        this.colesterol = colesterol;
        this.doencasCardiacas = doencasCardiacas;
        this.cirurgias = cirurgias;
        this.alergias = alergias;
        this.prontuario = new ArrayList<>();
    }

    public boolean Paciente() {
        return true;
    }


    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public Boolean getFuma() {
        return fuma;
    }

    public void setFuma(Boolean fuma) {
        this.fuma = fuma;
    }

    public Boolean getBebe() {
        return bebe;
    }

    public void setBebe(Boolean bebe) {
        this.bebe = bebe;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getColesterol() {
        return colesterol;
    }

    public void setColesterol(Boolean colesterol) {
        this.colesterol = colesterol;
    }

    public Boolean getDoencasCardiacas() {
        return doencasCardiacas;
    }

    public void setDoencasCardiacas(Boolean doencasCardiacas) {
        this.doencasCardiacas = doencasCardiacas;
    }

    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public List<Prontuario> getProntuario() {
        return prontuario;
    }

    public void setProntuario(List<Prontuario> prontuario) {
        this.prontuario = prontuario;
    }
    
    @Override
    public String toString() {
        String toReturn;
        toReturn = "Id: "+super.getId()
                +"\nNome: "+super.getNome()
                +"\nSobrenome: "+super.getSobrenome()
                +"\nEndereço: "+super.getEndereco()
                +"\nCpf: "+super.getCpf()
                +"\nTelefone fixo: "+super.getTelefoneFixo();
                ;
        return toReturn;
    }
    
    public String imprimeParaLista(){
        return super.getId()
                +"      "+super.getNome()+" "+super.getSobrenome()
                +"      "+super.getEndereco()
                +"      "+super.getCpf()
                +"      "+super.getTelefoneFixo();
        
    }
}
