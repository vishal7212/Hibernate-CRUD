package com.vk.vishalKart.service;

import com.vk.vishalKart.dal.ItemDal;
import com.vk.vishalKart.dal.OrderDal;
import com.vk.vishalKart.entity.Item;
import com.vk.vishalKart.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderDal orderDal;

    @Autowired
    ItemDal itemDal;


    @Transactional
    public Order OrderById(int id){

        return  orderDal.OrderById(id);
    }

    @Transactional
    public void  saveOrder(Order order)
    {
        Order saveOrder =new Order();
        saveOrder.setOrderType(order.getOrderType());
        List<Item> itemList =new ArrayList<>();
        for(Item item: order.getItems()){
            Item currentItem =itemDal.getItemById(item.getId());
            itemList.add(currentItem);
        }
        saveOrder.setItems(itemList);
        orderDal.saveOrder(saveOrder);
    }

    @Transactional
    public void deleteOrderById(int id){
        orderDal.deleteOrderById(id);
    }

}
