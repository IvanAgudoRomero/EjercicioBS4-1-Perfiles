package com.example.BS41Perfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bs41PerfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bs41PerfilesApplication.class, args);
		Configuracion c = new Configuracion();
		System.out.println(c.getValor1()+"\n"+c.getValor2());
	}

}
