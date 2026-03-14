package com.vk.vishalKart.service;


import com.vk.vishalKart.dal.ItemDal;
import com.vk.vishalKart.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemDal itemDal;


    @Transactional
   public Item getItemById(int id){
    return  itemDal.getItemById(id);
   }

   @Transactional
   public void  saveItem(Item item)
   {
       itemDal.saveItem(item);
   }

   @Transactional
   public void deleteById(int id){
        itemDal.deleteItem(id);
   }
   @Transactional
    public void updateItem(Item item){
        itemDal.updateItem(item);
   }
}
