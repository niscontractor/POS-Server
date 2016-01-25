package com.trt.services;

import com.trt.dao.EstimatedRateDao;
import com.trt.model.EstimatedRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstimatedRateServiceImpl implements EstimatedRateService {

    @Autowired
    EstimatedRateDao estimatedRateDao;

    @Override
    public Long addEstimatedRate(EstimatedRate estimatedRate) throws Exception {
        return estimatedRateDao.addEstimatedRate(estimatedRate);
    }

    @Override
    public EstimatedRate getEstimatedRateByInsurance(long insuranceDetailId) throws Exception {
        EstimatedRate insuranceById = estimatedRateDao.getEstimatedRateByInsurance(insuranceDetailId);
        System.out.println("insuranceById 22::" + insuranceById);
        return insuranceById;
    }
}
