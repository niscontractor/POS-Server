package com.trt.controller;

import com.trt.model.InsuranceDetails;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.trt.services.InsuranceDetailsService;
import javax.transaction.Status;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InsuranceDetailsController {

    @Autowired
    InsuranceDetailsService insuranceDetailsService;

    static final Logger logger = Logger.getLogger(InsuranceDetailsController.class);

    @RequestMapping(value = "/insurance/{id}", method = RequestMethod.GET)
    public @ResponseBody
    InsuranceDetails getInsurance(@PathVariable("id") long id) {
        InsuranceDetails insuranceDetail = null;
        try {
            insuranceDetail = insuranceDetailsService.getInsuranceById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return insuranceDetail;
    }

    @RequestMapping(value = "/insurance", method = RequestMethod.POST)
    public @ResponseBody
    Long addInsurance(@RequestBody InsuranceDetails insuranceDetail) {
        try {
            Long value = insuranceDetailsService.addInsurance(insuranceDetail);
            System.out.println("the value in controller is: " + value);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
