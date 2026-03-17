package com.vk.vishalKart.service;


import com.vk.vishalKart.dal.ItemReviewDal;
import com.vk.vishalKart.entity.ItemReview;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemReviewService {

    @Autowired
    ItemReviewDal itemReviewDal;

    @Transactional
    public void save(ItemReview review){
        itemReviewDal.save(review);

    }
}
