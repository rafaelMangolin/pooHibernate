package Modelo;

import com.sun.istack.internal.NotNull;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorValue("USUARIO_TIPO")
public class Medico extends Usuario {
    @NotNull
    private String crm;
    @NotNull
    private String especializacao;

    public Medico() {
        
    }

    
    public Medico(String crm, String especializacao, String login, String senha, String nome, String sobrenome, Date dataNascimento, String telefoneFixo, String telefoneCelular, String email, String endereco, String cpf, String rg) {
        super(login, senha, nome, sobrenome, dataNascimento, telefoneFixo, telefoneCelular, email, endereco, cpf, rg);
        this.crm = crm;
        this.especializacao = especializacao;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return "Id: " + super.getId()
                + "\nNome: " + super.getNome()
                + "\nSobrenome: " + super.getSobrenome()
                + "\nCRM: " + this.getCrm()
                + "\nTelefone fixo: " + super.getTelefoneFixo();
    }

}
