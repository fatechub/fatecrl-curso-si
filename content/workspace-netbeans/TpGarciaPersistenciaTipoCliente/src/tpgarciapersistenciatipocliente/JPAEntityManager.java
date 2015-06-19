package tpgarciapersistenciatipocliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAEntityManager {
    public static EntityManager getEntityManager(){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ciro_garciatipocliente");
            EntityManager manager = emf.createEntityManager();
            return manager;
    }
}
