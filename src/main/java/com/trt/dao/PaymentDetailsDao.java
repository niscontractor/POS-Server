package com.trt.dao;

import com.trt.model.PaymentDetails;

public interface PaymentDetailsDao extends GenericDao<PaymentDetails, Long> {

    public Long addPaymentDetails(PaymentDetails paymentDetails) throws Exception;

    public PaymentDetails getPaymentDetailsByInsurancePurchase(long insurancePurchaseDetailId) throws Exception;

}
