package com.bayer.accrual.databroker.repositories;

import com.bayer.accrual.databroker.models.POAccrualDataDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface POAccrualDataRepository extends JpaRepository<POAccrualDataDTO, Long> {

}
