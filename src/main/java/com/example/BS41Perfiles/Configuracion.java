package com.example.BS41Perfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix="spring.demo")
@Configuration
public class Configuracion {
    private String valor1 = "aaaaaaa";
    private String valor2 = "bbbbbbb";

    public String getValor1() {
        return valor1;
    }

    public String getValor2() {
        return valor2;
    }
}
