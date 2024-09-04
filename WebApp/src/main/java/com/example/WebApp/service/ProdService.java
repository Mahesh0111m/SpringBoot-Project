package com.example.WebApp.service;

import com.example.WebApp.model.Product;
import com.example.WebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProdService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public void addProducts(Product prod) {
        repo.save(prod);
    }

    public void deleteById(int prodId) {
        repo.deleteById(prodId);
    }
}
