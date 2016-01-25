package com.trt.services;

import com.trt.model.InsuranceDetails;

public interface InsuranceDetailsService {

    public long addInsurance(InsuranceDetails insuranceDetail) throws Exception;

    public InsuranceDetails getInsuranceById(long id) throws Exception;
}
