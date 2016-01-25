package com.trt.controller;

import com.trt.model.Discounts;
import com.trt.model.EstimatedRate;
import com.trt.services.DiscountsService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/discounts")
public class DiscountsController {

    @Autowired
    DiscountsService discountsService;

    static final Logger logger = Logger.getLogger(DiscountsController.class);

    @RequestMapping(value = "/discounts/{insurance_details_id}", method = RequestMethod.GET)
    public @ResponseBody
    List<Discounts> getDiscountsByInsurance(@PathVariable("insurance_details_id") long insuranceDetailsId) {
        List<Discounts> discountsList= null;
        try {
            discountsList = discountsService.getDiscountsByInsurance(insuranceDetailsId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return discountsList;
    }

}
