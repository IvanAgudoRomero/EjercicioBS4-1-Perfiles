package com.example.BS41Perfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {
    @Autowired
    private Configuracion conf;

    @Value("${URL}")
    private String url;

    @Value("${password}")
    private String password;

    @GetMapping("/parametros")
    public String parametros(){
        return "url: "+url+"\npassword: "+password;
    }

    @GetMapping("/valores")
    public String valores(){
        return "Valor1: "+conf.getValor1()+"\nValor2: "+conf.getValor2();
    }
}
