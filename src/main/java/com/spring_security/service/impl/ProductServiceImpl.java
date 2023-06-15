package com.spring_security.service.impl;

import com.spring_security.model.Product;
import com.spring_security.repository.ProductRepository;
import com.spring_security.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Iterable<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remote(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public List<Product> findAllByNameContaining(String name) {
        return productRepository.findAllByNameContaining(name);
    }
}
