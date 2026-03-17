package com.vk.vishalKart.dal;

import com.vk.vishalKart.entity.Order;

public interface OrderDal {

    Order OrderById(int id);

    void deleteOrderById(int id);

    void saveOrder(Order saveOrders);

}
