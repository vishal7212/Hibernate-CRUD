package com.vk.vishalKart.dal;

import com.vk.vishalKart.entity.ItemDetails;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class itemDetailsDalImpl implements ItemDetailsDal {

    @Autowired
    EntityManager em;

    @Override
    public void deleteById(Integer id) {
        Session session = em.unwrap(Session.class);
        ItemDetails itemDetails = session.get(ItemDetails.class, id);
        session.delete(itemDetails);

    }
}
