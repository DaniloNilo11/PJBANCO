package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		var leituraRetorno = new LeituraRetronoBancoBrasil();
		final var processarBoletos = new ProcessarBoletos(leituraRetorno);
		processarBoletos.processar("banco-brasil-1.csv");
	}

}
