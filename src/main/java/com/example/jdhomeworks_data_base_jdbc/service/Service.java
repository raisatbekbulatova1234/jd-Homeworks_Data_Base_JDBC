package com.example.jdhomeworks_data_base_jdbc.service;

import com.example.jdhomeworks_data_base_jdbc.repository.Repository;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<String> getProducts(String name) {
        return repository.getProductName(name);
    }
}