package com.sb.juices2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "drink")
public class juice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;

    public juice() {}

    public juice(String name, int price) {
        this.name  = name;
        this.price = price;
    }

    public Long   getId()           { return id; }
    public void   setId(Long id)    { this.id = id; }
    public String getName()         { return name; }
    public void   setName(String n) { this.name = n; }
    public int    getPrice()        { return price; }
    public void   setPrice(int p)   { this.price = p; }
}