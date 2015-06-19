package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAEntityManager {
    private static EntityManagerFactory emf = null;
    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("agendacontatos");
        }
        return emf.createEntityManager();
    }
}
