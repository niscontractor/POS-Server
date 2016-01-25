package com.trt.services;

import com.trt.dao.DiscountsDao;
import org.springframework.beans.factory.annotation.Autowired;

import com.trt.model.Discounts;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DiscountsServiceImpl implements DiscountsService {

    @Autowired
    DiscountsDao discountsDao;

    @Override
    public List<Discounts> getDiscountsByInsurance(long insuranceDetailsId) throws Exception {
        List<Discounts> discountsList = discountsDao.getDiscountsByInsurance(insuranceDetailsId);
        return discountsList;
    }

}
