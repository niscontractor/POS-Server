package com.trt.services;

import com.trt.model.InsurancePurchaseDetails;
import org.springframework.stereotype.Service;


public interface InsurancePurchaseDetailsService {

    public InsurancePurchaseDetails getInsurancePurchaseDetailsById(long id) throws Exception;

    public Long addInsurancePurchaseDetails(InsurancePurchaseDetails insurancePurchaseDetails) throws Exception;

}
