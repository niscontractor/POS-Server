package com.trt.controller;

import com.trt.model.EstimatedRate;
import com.trt.model.InsuranceDetails;
import com.trt.model.PaymentDetails;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.trt.services.InsuranceDetailsService;
import com.trt.services.PaymentDetailsService;
import javax.transaction.Status;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/paymentDetails")
public class PaymentDetailsController {

    @Autowired
    PaymentDetailsService paymentDetailsService;

    static final Logger logger = Logger.getLogger(PaymentDetailsController.class);

    @RequestMapping(value = "/paymentDetails/{insurance_purchase_details_id}", method = RequestMethod.GET)
    public @ResponseBody
    PaymentDetails getPaymentDetailsByInsurancePurchase(@PathVariable("insurance_purchase_details_id") long insurancePurchaseDetailsId) {
        PaymentDetails paymentDetails = null;
        try {
            paymentDetails = paymentDetailsService.getPaymentDetailsByInsurancePurchase(insurancePurchaseDetailsId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paymentDetails;
    }

    @RequestMapping(value = "/paymentDetails", method = RequestMethod.POST)
    public @ResponseBody
    Long addPaymentDetails(@RequestBody PaymentDetails paymentDetails) {
        try {
            Long value = paymentDetailsService.addPaymentDetails(paymentDetails);
            System.out.println("the value in controller is: " + value);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
