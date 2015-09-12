package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Prontuario.class)
public abstract class Prontuario_ extends Modelo.Entidade_ {

	public static volatile SingularAttribute<Prontuario, String> diagnostico;
	public static volatile SingularAttribute<Prontuario, Paciente> paciente;
	public static volatile ListAttribute<Prontuario, String> sintoma;
	public static volatile SingularAttribute<Prontuario, String> tratamento;

}

