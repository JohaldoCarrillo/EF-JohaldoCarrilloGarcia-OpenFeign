package com.idat.ec4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EfJohaldoCarrilloViaje {

	public static void main(String[] args) {
		SpringApplication.run(EfJohaldoCarrilloViaje.class, args);
	}

}
