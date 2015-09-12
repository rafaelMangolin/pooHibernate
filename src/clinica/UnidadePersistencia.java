package clinica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UnidadePersistencia {
    
    private static final EntityManagerFactory emf;
    
    static {
        emf = Persistence.createEntityManagerFactory("ClinicaPU");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
}

