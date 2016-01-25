package com.trt.dao;

import com.trt.model.EstimatedRate;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EstimatedRateDaoImpl extends GenericDaoImpl<EstimatedRate, Long> implements EstimatedRateDao {

    @Autowired
    SessionFactory sessionFactory;

    private static final String INSURANCE_DETAILS_ID = "insuranceDetails.id";

    @Override
    public Long addEstimatedRate(EstimatedRate estimatedRate) throws Exception {
         Long value = null;
        if (estimatedRate.getId() != null && estimatedRate.getId()!=0) {
            update(estimatedRate);
            value = estimatedRate.getId();
        } else {
            value = create(estimatedRate);
        }
        System.out.println("the value is: " + value);
        return value;
    }

    @Override
    public EstimatedRate getEstimatedRateByInsurance(long insuranceDetailId) throws Exception {
        List<Criterion> list = new ArrayList<>();
        Criterion c = Restrictions.eq(INSURANCE_DETAILS_ID, insuranceDetailId);
        list.add(c);
        EstimatedRate estimatedRate = findEntityByCriteriaList(list);
        return estimatedRate;
    }

}
