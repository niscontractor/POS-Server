package com.trt.dao;

import com.trt.model.PaymentDetails;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDetailsDaoImpl extends GenericDaoImpl<PaymentDetails, Long> implements PaymentDetailsDao {

    @Autowired
    SessionFactory sessionFactory;
    private static final String INSURANCE_PURCHASE_DETAILS = "insurancePurchaseDetails.id";

    @Override
    public Long addPaymentDetails(PaymentDetails paymentDetails) {
        Long value = null;
        if (paymentDetails.getId() != null && paymentDetails.getId() != 0) {
            update(paymentDetails);
            value = paymentDetails.getId();
        } else {
            value = create(paymentDetails);
        }
        System.out.println("the value is: " + value);
        return value;
    }

    @Override
    public PaymentDetails getPaymentDetailsByInsurancePurchase(long insurancePurchaseDetailId) throws Exception {
        List<Criterion> list = new ArrayList<>();
        Criterion c = Restrictions.eq(INSURANCE_PURCHASE_DETAILS, insurancePurchaseDetailId);
        list.add(c);
        PaymentDetails paymentDetails = findEntityByCriteriaList(list);
        return paymentDetails;
    }

}
