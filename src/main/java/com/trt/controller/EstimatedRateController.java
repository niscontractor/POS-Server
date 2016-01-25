package com.trt.controller;

import com.trt.model.EstimatedRate;
import com.trt.model.InsuranceDetails;
import com.trt.services.EstimatedRateService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/estimatedRate")
public class EstimatedRateController {

    @Autowired
    EstimatedRateService estimatedRateService;

    static final Logger logger = Logger.getLogger(EstimatedRateController.class);

    @RequestMapping(value = "/estimatedRate/{insurance_details_id}", method = RequestMethod.GET)
    public @ResponseBody
    EstimatedRate getEstimatedRateByInsurance(@PathVariable("insurance_details_id") long insuranceDetailsId) {
        EstimatedRate estimatedRate = null;
        try {
            estimatedRate = estimatedRateService.getEstimatedRateByInsurance(insuranceDetailsId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return estimatedRate;
    }

    @RequestMapping(value = "/estimatedRate", method = RequestMethod.POST)
    public @ResponseBody
    Long addEstimatedRate(@RequestBody EstimatedRate estimatedRate) {
        try {
            return estimatedRateService.addEstimatedRate(estimatedRate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
