package DAO;

import Entity.BaseEntity;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;


public class BaseDAO<T extends BaseEntity> {

    @Inject
    EntityManager entityManager;

    @Transactional
    public void create(T entity) {
        entityManager.merge(entity);
        System.out.println("persist complete");
    }

    public void remove(T entity) {
    }

    public void update(T entity) {
    }

    public void delete(T entity) {
    }

}
