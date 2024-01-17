package com.pruebafractal.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebafractal.springboot.backend.apirest.repositories.ItemOrderRepository;

@RestController
@RequestMapping("/api/item-orders")
public class ItemOrderController<ItemOrder> {

	@Autowired
    private ItemOrderRepository itemOrderRepository;

    @GetMapping
    public List<ItemOrder> getAllItemOrders() {
        return (List<ItemOrder>) itemOrderRepository.findAll();
    }

}
