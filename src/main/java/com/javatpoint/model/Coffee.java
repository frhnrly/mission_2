package com.javatpoint.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Coffee {
    //Defining coffee id as primary key
    @Id
    @Column
    private int coffeeid;
    @Column
    private String coffeename;
    @Column
    private String addon;
    @Column
    private int price;
    public int getCoffeeid()
    {
        return coffeeid;
    }
    public void setCoffeeid(int coffeeid)
    {
        this.coffeeid = coffeeid;
    }
    public String getCoffeenamee()
    {
        return coffeename;
    }
    public void setCoffeename(String coffeename)
    {
        this.coffeename = coffeename;
    }
    public String getAuthor()
    {
        return addon;
    }
    public void setAddon(String addon)
    {
        this.addon = addon;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}