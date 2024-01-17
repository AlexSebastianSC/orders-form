package com.pruebafractal.springboot.backend.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebafractal.springboot.backend.apirest.models.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
