package com.bayer.accrual.databroker.controllers;

import com.bayer.accrual.databroker.models.POAccrualDataDTO;
import com.bayer.accrual.databroker.services.POAccrualDataService;
import com.sap.cds.services.cds.CdsService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cds.gen.poaccrualdatacontroller.POAccrualData;

import java.util.ArrayList;
import java.util.List;

@Controller
@ServiceName("POAccrualDataController")
public class POAccrualDataController2 implements EventHandler {
    @Autowired
    private POAccrualDataService poAccrualDataService;

    @On(event = CdsService.EVENT_CREATE, entity = "POAccrualDataController.POAccrualData")
    public void onCreate(POAccrualData data) {
        System.out.println("called create");

        POAccrualDataDTO dto = new POAccrualDataDTO();
        dto.setOPSYS(data.getOpsys());
        dto.setEBELN(data.getEbeln());
        dto.setController(data.getController());

        poAccrualDataService.insertPOAccrualData(dto);
    }

    @On(event = CdsService.EVENT_READ, entity = "POAccrualDataController.POAccrualData")
    public List<POAccrualData> onRead() {
        System.out.println("called read");

        List<POAccrualDataDTO> dtoList = poAccrualDataService.getAllPOAccrualData();
        List<POAccrualData> result = new ArrayList<>();
        for(POAccrualDataDTO dto : dtoList) {
            POAccrualData data = POAccrualData.create();
            data.setOpsys(dto.getOPSYS());
            data.setEbeln(dto.getEBELN());
            data.setController(dto.getController());

            result.add(data);
        }

        return result;
    }
}
