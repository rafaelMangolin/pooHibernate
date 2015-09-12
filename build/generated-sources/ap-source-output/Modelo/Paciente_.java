package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Paciente.class)
public abstract class Paciente_ extends Modelo.Pessoa_ {

	public static volatile SingularAttribute<Paciente, Boolean> doencasCardiacas;
	public static volatile ListAttribute<Paciente, Prontuario> prontuario;
	public static volatile SingularAttribute<Paciente, Boolean> fuma;
	public static volatile SingularAttribute<Paciente, Boolean> colesterol;
	public static volatile SingularAttribute<Paciente, String> convenio;
	public static volatile SingularAttribute<Paciente, Boolean> bebe;
	public static volatile SingularAttribute<Paciente, String> cirurgias;
	public static volatile SingularAttribute<Paciente, Boolean> diabetes;
	public static volatile SingularAttribute<Paciente, String> alergias;

}

