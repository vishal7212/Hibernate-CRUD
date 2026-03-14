package com.vk.vishalKart.controller;


import com.vk.vishalKart.entity.Item;
import com.vk.vishalKart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {


    @Autowired
    ItemService itemService;

    @GetMapping("/id/{id}")
    public Item getItemById( @PathVariable int id){
        return  itemService.getItemById(id);
    }

    @PostMapping("/save")
    public void saveItem( @RequestBody Item item){

        itemService.saveItem(item);

    }

    @DeleteMapping("/delete/id/{id}")
    public  void deleteItemById( @PathVariable  int id){
        itemService.deleteById(id);
    }

    @PutMapping("/update")
    public void updateItem(@RequestBody Item updateItem){
        itemService.updateItem(updateItem);

    }


}
