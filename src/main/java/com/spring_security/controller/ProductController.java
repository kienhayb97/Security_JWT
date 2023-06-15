package com.spring_security.controller;

import com.spring_security.model.Product;
import com.spring_security.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    private Environment env;
    @GetMapping("")
    public ResponseEntity<List<Product>> listAllProduct(){
        List<Product> products = (List<Product>) productService.findAllProduct();
        if (products.isEmpty()){
            return new ResponseEntity<List<Product>>(products, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
    }
}
