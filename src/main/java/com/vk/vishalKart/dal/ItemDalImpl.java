package com.vk.vishalKart.dal;

import com.vk.vishalKart.entity.Item;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDalImpl implements ItemDal {


    @Autowired
    EntityManager em;

    @Override
    public Item getItemById(int id) {
        Session session = em.unwrap(Session.class);
        Item item= session.get(Item.class, id);
        return item;
    }

    public void  saveItem(Item item)
    {
        Session session = em.unwrap(Session.class);
        session.save(item);
    }

    public void deleteItem(int id){
        Session session = em.unwrap(Session.class);
        Item item= session.get(Item.class, id);
        session.delete(item);

    }

    public void updateItem(Item item){
        Session session = em.unwrap(Session.class);
        Item it= session.get(Item.class, item.getId());
        it.setDescription(item.getDescription());
        it.setTitle(item.getTitle());
        session.update(it);

    }
}
