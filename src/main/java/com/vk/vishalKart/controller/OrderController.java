package com.vk.vishalKart.controller;


import com.vk.vishalKart.entity.Item;
import com.vk.vishalKart.entity.Order;
import com.vk.vishalKart.service.ItemService;
import com.vk.vishalKart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    OrderService orderService;

    @GetMapping("/id/{id}")
    public Order OrderById(@PathVariable int id){
        return  orderService.OrderById(id);
    }

    @PostMapping("/save")
    public void saveOrder( @RequestBody Order order){

        orderService.saveOrder(order);

    }

    @DeleteMapping("/delete/id/{id}")
    public  void deleteOrderById( @PathVariable  int id){
        orderService.deleteOrderById(id);
    }
}
