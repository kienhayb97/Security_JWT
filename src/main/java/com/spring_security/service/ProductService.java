package com.spring_security.service;

import com.spring_security.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Iterable<Product> findAllProduct();

    Optional<Product> findById(Long id);

    void save(Product product);

    void remote(Long id);

    List<Product> findAllByNameContaining(String name);

}
