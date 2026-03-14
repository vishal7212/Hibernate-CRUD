package com.vk.vishalKart.entity;


import jakarta.persistence.*;

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
