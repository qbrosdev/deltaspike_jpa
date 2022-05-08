package DAO;

import Entity.Person;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class PersonDAO {

    @Inject
    EntityManager entityManager;

    @Transactional
    public void create(Person entity) {
        entityManager.merge(entity);
        System.out.println("persist complete************************************************");
    }

}
