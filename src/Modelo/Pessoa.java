package Modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rafael
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ENTIDADE_ID")
//@DiscriminatorValue("ENTIDADE_TIPO")
//@DiscriminatorColumn(name = "PESSOA_TIPO")
public class Pessoa extends Entidade {
    @Column(nullable = false)
    private String nome;
    private String sobrenome;
    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date dataNascimento;
    @Column(nullable = false)
    private String telefoneFixo;
    private String telefoneCelular;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String rg;

    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String sobrenome, Date dataNascimento, String telefoneFixo, String telefoneCelular, String email, String endereco, String cpf, String rg) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
