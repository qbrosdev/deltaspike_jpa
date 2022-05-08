package CDIproducers;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EmFactory {

    public static String PU_NAME = "MYPU";

    @Produces
    public EntityManager createEM() {
        final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory(PU_NAME);
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }
}
