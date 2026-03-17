package com.vk.vishalKart.service;


import com.vk.vishalKart.dal.ItemDetailsDal;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemDetailsService {

    @Autowired
    ItemDetailsDal itemDetailsDal;

    @Transactional
    public void deleteById(int id){
        itemDetailsDal.deleteById(id);


    }
}
