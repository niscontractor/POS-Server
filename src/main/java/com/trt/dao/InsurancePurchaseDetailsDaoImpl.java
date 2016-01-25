package com.trt.dao;

import com.trt.model.EstimatedRate;
import com.trt.model.InsurancePurchaseDetails;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class InsurancePurchaseDetailsDaoImpl extends GenericDaoImpl<InsurancePurchaseDetails, Long> implements InsurancePurchaseDetailsDao {

    private static final String INSURANCE_DETAILS_ID = "insuranceDetails.id";

    @Override
    public Long addInsurancePurchaseDetails(InsurancePurchaseDetails insurancePurchaseDetails) throws Exception {
         Long value = null;
        if (insurancePurchaseDetails.getId() != null && insurancePurchaseDetails.getId()!=0) {
            update(insurancePurchaseDetails);
            value = insurancePurchaseDetails.getId();
        } else {
            value = create(insurancePurchaseDetails);
        }
        System.out.println("the value is: " + value);
        return value;
    }

    @Override
    public InsurancePurchaseDetails getInsurancePurchaseDetailsById(long id) throws Exception {
        List<Criterion> list = new ArrayList<>();
        Criterion c = Restrictions.eq(INSURANCE_DETAILS_ID, id);
        list.add(c);
        InsurancePurchaseDetails insurancePurchaseDetails = findEntityByCriteriaList(list);
        return insurancePurchaseDetails;
//        InsurancePurchaseDetails insurancePurchaseDetails = retrieveById(id);
//        return insurancePurchaseDetails;
    }

}
