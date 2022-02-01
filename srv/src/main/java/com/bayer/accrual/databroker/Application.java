package com.bayer.accrual.databroker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
//	service POAccrualDataController {
//		entity POAccrualData {
//		key OPSYS : String(3);
//		EBELN : Integer;
//		controller : String(25);
//		}
//		}