/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trt.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author trt
 * @param <EntityType>
 * @param <IDType>
 */
public abstract class GenericDaoImpl<EntityType, IDType extends Serializable> implements GenericDao<EntityType, IDType> {

    @Autowired
    private SessionFactory sessionFactory;
    private final Class<EntityType> persistentClass = (Class<EntityType>) ((ParameterizedType) getClass()
            .getGenericSuperclass()).getActualTypeArguments()[0];

    Session session = null;
    Transaction tx = null;

    public Class<EntityType> getPersistentClass() {
        return persistentClass;
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * Return the persistent instance of the given entity class with the given
     * identifier, or null if there is no such persistent instance.
     *
     * @param id an identifier
     * @return a persistent instance or null
     */
    @Override
    public EntityType retrieveById(IDType id) {
        EntityType get = null;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (Exception e) {
            session = sessionFactory.openSession();
        }
        try {
            tx = session.beginTransaction();
            get = (EntityType) session.get(persistentClass, id);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return get;
    }

    /**
     * Persist the given transient instance, first assigning a generated
     * identifier.
     *
     * @param entity object a transient instance of a persistent class
     * @return the generated identifier
     */
    @Override
    public IDType create(EntityType entity) {
        Serializable id = null;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (Exception e) {
            session = sessionFactory.openSession();
        }
        try {
            tx = session.beginTransaction();
            id = session.save(entity);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        System.out.println("the Id is: " + id);
        return (IDType) id;
    }

    @Override
    public void update(EntityType entity) {

        try {
            session = sessionFactory.getCurrentSession();
        } catch (Exception e) {
            session = sessionFactory.openSession();
        }
        try {
            tx = session.beginTransaction();
            session.update(entity);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public EntityType findEntityByCriteriaList(List<Criterion> criterions) {
        EntityType entityObj = null;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (Exception e) {
            session = sessionFactory.openSession();
        }
        try {
            tx = session.beginTransaction();
            Criteria criteria = session.createCriteria(persistentClass);
            for (Criterion c : criterions) {
                criteria.add(c);
            }
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            entityObj = (EntityType) criteria.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return entityObj;
    }

    @Override
    public List<EntityType> findByCriteriaList(List<Criterion> criterions) {
        List<EntityType> list = null;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (Exception e) {
            session = sessionFactory.openSession();
        }
        try {
            tx = session.beginTransaction();
            Criteria criteria = session.createCriteria(persistentClass);
            for (Criterion c : criterions) {
                criteria.add(c);
            }
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            list = criteria.list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }

}
