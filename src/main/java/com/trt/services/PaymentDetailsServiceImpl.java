package com.trt.services;


import org.springframework.beans.factory.annotation.Autowired;

import com.trt.dao.PaymentDetailsDao;
import com.trt.model.PaymentDetails;
import org.springframework.stereotype.Service;


@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {

	@Autowired
	       PaymentDetailsDao paymentDetailsDao;
	
	@Override
	public Long addPaymentDetails(PaymentDetails paymentDetails) throws Exception {
		return paymentDetailsDao.addPaymentDetails(paymentDetails);
	}
//
	@Override
	public PaymentDetails getPaymentDetailsByInsurancePurchase(long insurancePurchaseDetailId) throws Exception{
            PaymentDetails paymentDetails = paymentDetailsDao.getPaymentDetailsByInsurancePurchase(insurancePurchaseDetailId);
            return paymentDetails;
	}

}
