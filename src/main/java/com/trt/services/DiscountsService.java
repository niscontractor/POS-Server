package com.trt.services;

import com.trt.model.Discounts;
import java.util.List;

public interface DiscountsService {

    public List<Discounts> getDiscountsByInsurance(long insuranceDetailsId) throws Exception;
}
