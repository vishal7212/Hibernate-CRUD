package com.vk.vishalKart.dal;

import com.vk.vishalKart.entity.Item;

public interface ItemDal {

    Item getItemById(int id);

    void saveItem(Item item);

    void deleteItem(int id);

    void updateItem(Item item);
}
