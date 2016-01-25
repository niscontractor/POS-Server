package com.trt.controller;

import com.trt.model.InsuranceDetails;
import com.trt.model.InsurancePurchaseDetails;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.trt.services.InsurancePurchaseDetailsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/insurancePurchaseDetails")
public class InsurancePurchaseDetailsController {

    @Autowired
    InsurancePurchaseDetailsService insurancePurchaseDetailsService;

    static final Logger logger = Logger.getLogger(InsurancePurchaseDetailsController.class);

    @RequestMapping(value = "/insurancePurchaseDetails/{id}", method = RequestMethod.GET)
    public @ResponseBody
    InsurancePurchaseDetails getInsurancePurchaseDetails(@PathVariable("id") long id) {
        InsurancePurchaseDetails insurancePurchaseDetails = null;
        try {
            insurancePurchaseDetails = insurancePurchaseDetailsService.getInsurancePurchaseDetailsById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return insurancePurchaseDetails;
    }

    @RequestMapping(value = "/insurancePurchaseDetails", method = RequestMethod.POST)
    public @ResponseBody
    Long addInsurancePurchaseDetails(@RequestBody InsurancePurchaseDetails insurancePurchaseDetails) {
        try {
            return insurancePurchaseDetailsService.addInsurancePurchaseDetails(insurancePurchaseDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
