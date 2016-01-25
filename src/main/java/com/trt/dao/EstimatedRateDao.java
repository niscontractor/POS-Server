package com.trt.dao;

import com.trt.model.EstimatedRate;


public interface EstimatedRateDao extends GenericDao<EstimatedRate, Long> {

    public Long addEstimatedRate(EstimatedRate estimatedRate) throws Exception;

    public EstimatedRate getEstimatedRateByInsurance(long insuranceDetailId) throws Exception;

}
