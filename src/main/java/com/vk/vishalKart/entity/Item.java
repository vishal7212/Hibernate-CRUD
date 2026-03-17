package com.vk.vishalKart.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="item")
public class Item {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String title;

    @Column
    private String description;



    @OneToOne(cascade=CascadeType.ALL)
    private ItemDetails itemDetails;


    @OneToMany(mappedBy= "item", cascade=CascadeType.ALL)
    @JsonManagedReference
    private List<ItemReview> itemReview;

    @ManyToMany(mappedBy = "items")
    @JsonIgnore
    private List<Order> orders;



    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<ItemReview> getItemReview() {
        return itemReview;
    }

    public void setItemReview(List<ItemReview> itemReview) {
        this.itemReview = itemReview;
    }


    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
