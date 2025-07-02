package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/")
    public String mostrarIndex() {
        return "index";
    }

    @GetMapping("/noticias")
    public String mostrarNoticias() {
        return "noticias";
    }

    @GetMapping("/articulos")
    public String mostrarArticulos() {
        return "articulos";
    }

}