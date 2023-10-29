package com.example.prueba_acceso.prueba_acceso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PruebaAccesoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaAccesoApplication.class, args);
	}

	public void exercice2 (){
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("VINCLE");
			} else if (i % 3 == 0) {
				System.out.println("VIN");
			} else if (i % 5 == 0) {
				System.out.println("CLE");
			} else {
				System.out.println(i);
			}
		}
	}

}
