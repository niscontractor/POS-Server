package com.trt.dao;

import com.trt.model.Discounts;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class DiscountsDaoImpl extends GenericDaoImpl<Discounts, Long> implements DiscountsDao {

    private static final String INSURANCE_DETAILS = "insuranceDetails.id";

    @Override
    public List<Discounts> getDiscountsByInsurance(long insuranceDetailsId) throws Exception {
         List<Criterion> list = new ArrayList<>();
        Criterion c = Restrictions.eq(INSURANCE_DETAILS, insuranceDetailsId);
        list.add(c);
        List<Discounts> discountsList = findByCriteriaList(list);
        return discountsList;
    }

}
