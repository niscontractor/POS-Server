package com.trt.dao;

import com.trt.model.InsurancePurchaseDetails;


public interface InsurancePurchaseDetailsDao extends GenericDao<InsurancePurchaseDetails, Long> {

    public Long addInsurancePurchaseDetails(InsurancePurchaseDetails insurancePurchaseDetails) throws Exception;

    public InsurancePurchaseDetails getInsurancePurchaseDetailsById(long id) throws Exception;

}
