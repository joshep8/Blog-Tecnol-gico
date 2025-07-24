package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Producto;
import com.example.demo.service.ProductoService;


@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public String verProductos(Model model) {
        model.addAttribute("productos", productoService.listarProductos());
        model.addAttribute("producto", new Producto());
        return "productos";
    }

    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute Producto producto) {
        productoService.guardarProducto(producto);
        return "redirect:/productos";
    }
}