package com.trt.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.trt.dao.InsurancePurchaseDetailsDao;
import com.trt.model.InsurancePurchaseDetails;
import org.springframework.stereotype.Service;

@Service
public class InsurancePurchaseDetailsServiceImpl implements InsurancePurchaseDetailsService {

    @Autowired
    InsurancePurchaseDetailsDao insurancePurchaseDetailsDao;

    @Override
    public Long addInsurancePurchaseDetails(InsurancePurchaseDetails insurancePurchaseDetails) throws Exception {
        return insurancePurchaseDetailsDao.addInsurancePurchaseDetails(insurancePurchaseDetails);
    }
//

    @Override
    public InsurancePurchaseDetails getInsurancePurchaseDetailsById(long id) throws Exception {
        InsurancePurchaseDetails insurancePurchaseDetails = insurancePurchaseDetailsDao.getInsurancePurchaseDetailsById(id);
        return insurancePurchaseDetails;
    }

}
