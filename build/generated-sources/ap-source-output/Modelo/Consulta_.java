package Modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Consulta.class)
public abstract class Consulta_ extends Modelo.Entidade_ {

	public static volatile SingularAttribute<Consulta, String> tipo;
	public static volatile SingularAttribute<Consulta, Date> data;
	public static volatile SingularAttribute<Consulta, String> hora;
	public static volatile SingularAttribute<Consulta, Paciente> paciente;
	public static volatile SingularAttribute<Consulta, Medico> medico;

}

