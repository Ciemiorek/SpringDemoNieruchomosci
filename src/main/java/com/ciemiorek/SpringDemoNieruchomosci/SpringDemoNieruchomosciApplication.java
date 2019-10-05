package com.ciemiorek.SpringDemoNieruchomosci;

import com.ciemiorek.SpringDemoNieruchomosci.utils.BootStrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringDemoNieruchomosciApplication {


	private BootStrap bootStrap;

	public SpringDemoNieruchomosciApplication(BootStrap bootStrap ) {
		this.bootStrap = bootStrap;
	}

	@PostConstruct
	public void init(){

		bootStrap.initializeRepository();
	}


	public static void main(String[] args) {

		SpringApplication.run(SpringDemoNieruchomosciApplication.class, args);
	}


}
