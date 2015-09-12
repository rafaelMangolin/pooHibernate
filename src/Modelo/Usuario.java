package Modelo;

import com.sun.istack.internal.NotNull;
import java.util.Date;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author rafael
 */
@Entity
@PrimaryKeyJoinColumn(name="PESSOA_ID")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends Pessoa{
    @NotNull
    private String login;
    @NotNull
    private String senha;

    public Usuario() {
        super();
    }

    
    
    public Usuario(String login, String senha, String nome, String sobrenome, Date dataNascimento, String telefoneFixo, String telefoneCelular, String email, String endereco, String cpf, String rg) {
        super(nome, sobrenome, dataNascimento, telefoneFixo, telefoneCelular, email, endereco, cpf, rg);
        this.login = login;
        this.senha = senha;
    }



  

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
