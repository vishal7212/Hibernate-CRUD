package com.vk.vishalKart.entity;


import jakarta.persistence.*;

@Table(name="item_details")
@Entity
public class ItemDetails {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String brand;

    @OneToOne(mappedBy = "itemDetails",cascade = CascadeType.ALL)
    private Item item;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Column
    private double price;

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column
    private String category;



}
