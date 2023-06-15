package com.spring_security.service.impl;

import com.spring_security.model.Category;
import com.spring_security.repository.CategoryRepository;
import com.spring_security.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void save(Category category) {
categoryRepository.save(category);
    }

    @Override
    public void remove(Long id) {
categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> findAllByNameContaining(String name) {
        return categoryRepository.findAllByNameContaining(name);
    }
}
