package com.example.project.service;

import com.example.project.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void addProduct(Product product);
    List<Product> listProduct();
    Optional<Product> getProductById(long productId);
    List<Product> findByCategory(long categoryId);
    void deleteProduct(long productId);

}

