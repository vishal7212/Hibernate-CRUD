package com.vk.vishalKart.dal;

import com.vk.vishalKart.entity.ItemReview;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ItemReviewDalImpl implements ItemReviewDal {

    @Autowired
    EntityManager em;

    public void save(ItemReview review){
        Session session = em.unwrap(Session.class);
        session.save(review);
    }
}
