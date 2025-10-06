package com.ista.springboot.form.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

	@GetMapping("/")
    public String inicio() {
        return "index"; // devuelve la plantilla index.html
    }
}
