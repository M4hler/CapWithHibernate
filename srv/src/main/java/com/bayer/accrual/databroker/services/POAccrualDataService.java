package com.bayer.accrual.databroker.services;

import com.bayer.accrual.databroker.models.POAccrualDataDTO;
import com.bayer.accrual.databroker.repositories.POAccrualDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class POAccrualDataService {
    @Autowired
    private POAccrualDataRepository poAccrualDataRepository;

    public void insertPOAccrualData(POAccrualDataDTO data) {
        poAccrualDataRepository.save(data);
    }

    public List<POAccrualDataDTO> getAllPOAccrualData() {
        return poAccrualDataRepository.findAll();
    }
}
