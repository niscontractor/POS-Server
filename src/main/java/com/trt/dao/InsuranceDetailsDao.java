package com.trt.dao;

import com.trt.model.InsuranceDetails;


public interface InsuranceDetailsDao extends GenericDao<InsuranceDetails, Long>  {

    public long addInsurance(InsuranceDetails insuranceDetail) throws Exception;

    public InsuranceDetails getInsuranceById(long id) throws Exception;
}
