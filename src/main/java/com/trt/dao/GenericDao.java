/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trt.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;

/**
 *
 * @author trt
 * @param <EntityType>
 * @param <IDType>
 */
public interface GenericDao<EntityType, IDType extends Serializable> {

    public EntityType retrieveById(IDType id);

    public IDType create(EntityType entity);

    public void update(EntityType entity);

    public EntityType findEntityByCriteriaList(List<Criterion> criterions);

    public List<EntityType> findByCriteriaList(List<Criterion> criterions);

}
