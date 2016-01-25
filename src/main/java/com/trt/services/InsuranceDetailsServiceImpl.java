package com.trt.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.trt.dao.InsuranceDetailsDao;
import com.trt.model.InsuranceDetails;
import org.springframework.stereotype.Service;

@Service
public class InsuranceDetailsServiceImpl implements InsuranceDetailsService {

    @Autowired
    InsuranceDetailsDao insuranceDetailsDao;

    @Override
    public long addInsurance(InsuranceDetails insuranceDetail) throws Exception {
         long value = insuranceDetailsDao.addInsurance(insuranceDetail);
         System.out.println("the value in service :" + value);
         return value;
    }

    @Override
    public InsuranceDetails getInsuranceById(long id) throws Exception {
        InsuranceDetails insuranceById = insuranceDetailsDao.getInsuranceById(id);
        return insuranceById;
    }

}
