package com.vk.vishalKart.controller;


import com.vk.vishalKart.service.ItemDetailsService;
import com.vk.vishalKart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class ItemDetailsController {


    @Autowired
    ItemDetailsService ItemDetailsService;


    @DeleteMapping("id/{id}")
    public void delete(@PathVariable Integer id){

        ItemDetailsService.deleteById(id);

    }
}
