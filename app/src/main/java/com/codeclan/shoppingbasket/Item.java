package com.codeclan.shoppingbasket;

/**
 * Created by user on 31/03/2017.
 */

public class Item {

    private String itemName;
    private int price;   //price in pence

    public Item(String itemName, int price){
        this.itemName = itemName;
        this.price = price;
    }


    public String getName() {
        return itemName;
    }

    public void setName(String name) {
        this.itemName = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
