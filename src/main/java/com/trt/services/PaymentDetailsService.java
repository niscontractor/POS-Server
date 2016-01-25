package com.trt.services;

import com.trt.model.PaymentDetails;

public interface PaymentDetailsService {

    public Long addPaymentDetails(PaymentDetails paymentDetails) throws Exception;

    public PaymentDetails getPaymentDetailsByInsurancePurchase(long insurancePurchaseDetailId) throws Exception;
}
