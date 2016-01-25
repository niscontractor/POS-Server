package com.trt.services;

import com.trt.model.EstimatedRate;

public interface EstimatedRateService {

    public Long addEstimatedRate(EstimatedRate estimatedRate) throws Exception;

    public EstimatedRate getEstimatedRateByInsurance(long insuranceDetailId) throws Exception;
}
