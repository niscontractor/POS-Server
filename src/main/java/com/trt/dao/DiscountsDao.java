package com.trt.dao;

import com.trt.model.Discounts;
import java.util.List;

public interface DiscountsDao extends GenericDao<Discounts, Long> {

    public List<Discounts> getDiscountsByInsurance(long insuranceDetailsId) throws Exception;

}
