package com.trt.dao;

import com.trt.model.InsuranceDetails;
import org.springframework.stereotype.Repository;

@Repository
public class InsuranceDetailsDaoImpl extends GenericDaoImpl<InsuranceDetails, Long> implements InsuranceDetailsDao {

    @Override
    public long addInsurance(InsuranceDetails insuranceDetail) throws Exception {
        Long value = null;
        if (insuranceDetail.getId() != null && insuranceDetail.getId()!=0) {
            update(insuranceDetail);
            value = insuranceDetail.getId();
        } else {
            value = create(insuranceDetail);
        }
        System.out.println("the value is: " + value);
        return value;
    }

    @Override
    public InsuranceDetails getInsuranceById(long id) throws Exception {
        InsuranceDetails insuranceDetails = (InsuranceDetails) retrieveById(id);
        return insuranceDetails;
    }

}
