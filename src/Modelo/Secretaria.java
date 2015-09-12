package Modelo;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Secretaria extends Usuario{

    public Secretaria() {
    }

    public Secretaria(String login, String senha, String nome, String sobrenome, Date dataNascimento, String telefoneFixo, String telefoneCelular, String email, String endereco, String cpf, String rg) {
        super(login, senha, nome, sobrenome, dataNascimento, telefoneFixo, telefoneCelular, email, endereco, cpf, rg);
    }


    
}
