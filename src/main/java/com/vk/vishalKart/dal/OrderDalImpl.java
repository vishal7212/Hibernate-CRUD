package com.vk.vishalKart.dal;


import com.vk.vishalKart.entity.Order;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDalImpl implements OrderDal {

    @Autowired
    EntityManager em;


    @Override
    public Order OrderById(int id) {

        Session session = em.unwrap(Session.class);
        Order  order = session.get(Order.class, id);
        return order;
    }

    @Override
    public void deleteOrderById(int id) {
        Session session = em.unwrap(Session.class);
        Order order = session.get(Order.class, id);
        session.delete(order);
    }

    @Override
    public void saveOrder(Order saveOrders) {
        Session session = em.unwrap(Session.class);
        session.save(saveOrders);

    }
}
