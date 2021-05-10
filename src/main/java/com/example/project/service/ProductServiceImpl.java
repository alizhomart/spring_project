package com.example.project.service;

import com.example.project.dao.ProductRepository;
import com.example.project.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> listProduct() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(long productId) {
        return productRepository.findById(productId);
    }

    @Override
    public List<Product> findByCategory(long categoryId) {
        return productRepository.findByCategory_CategoryId(categoryId);
    }

    @Override
    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }


}