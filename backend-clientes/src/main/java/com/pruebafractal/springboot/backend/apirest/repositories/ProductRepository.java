package com.pruebafractal.springboot.backend.apirest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebafractal.springboot.backend.apirest.models.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
