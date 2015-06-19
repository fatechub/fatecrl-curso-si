package util.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Adam Macias, Flávia Souza, Ramon Duran
 */
public class JPAEntityManager {
    private static EntityManagerFactory emf = null;
    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("agenda");
        }
        return emf.createEntityManager();
    }
}
