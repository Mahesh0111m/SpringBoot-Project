package com.example.WebApp.controller;

import com.example.WebApp.model.Product;
import com.example.WebApp.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProdService service;

    @RequestMapping("/")
    public String greet()
    {
        return  "hello";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return service.getAllProducts();
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod)
    {
        service.addProducts(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteById(@PathVariable int prodId)
    {
        service.deleteById(prodId);
    }
}
