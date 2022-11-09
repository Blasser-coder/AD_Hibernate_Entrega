package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


abstract class Dao<T, K> {
    EntityManager em = Persistence
            .createEntityManagerFactory("default")
            .createEntityManager();
    public EntityManager getEntityManager() {
        return this.em;
    }
    public abstract T Consultar(K id);


    public T Crear(T t) {
        EntityTransaction entityTransaction= em.getTransaction();
        entityTransaction.begin();
        em.persist(t);
        entityTransaction.commit();
        return t;
    }
    public T Actualizar(T t) {
        EntityTransaction entityTransaction= em.getTransaction();
        entityTransaction.begin();
        em.merge(t);
        entityTransaction.commit();
        return t;
    }
    public void Borrar(T t) {
        EntityTransaction entityTransaction= em.getTransaction();
        entityTransaction.begin();
        em.remove(t);
        entityTransaction.commit();
    }
}