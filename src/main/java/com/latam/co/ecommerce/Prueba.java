package com.latam.co.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prueba {
    @GetMapping("/hola")
    public String hota(){
        return "Hola Rafael";
    }
}
