package com.example.prueba_acceso.prueba_acceso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PruebaAccesoApplication {

	public static void main(String[] args) {

		SpringApplication.run(PruebaAccesoApplication.class, args);
	}

	public void exercice1 (){
		for (int i = 1; i <= 100; i++) {
			String output = "";
			if (i % 3 == 0) {
				output += "VIN";
			}
			if (i % 5 == 0) {
				output += "CLE";
			}
			if (output.isEmpty()) {
				output = String.valueOf(i);
			}
			System.out.println(output);
		}
	}

}
