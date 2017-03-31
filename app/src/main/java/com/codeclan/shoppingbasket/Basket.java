package com.codeclan.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 31/03/2017.
 */

public class Basket {

    ArrayList<Item> basketContents;

    public Basket(){
        this.basketContents = new ArrayList<Item>();
    }

    public void addItem(Item item){
        Item itemToAdd = item;
        basketContents.add(itemToAdd);
    }

    public int numberOfItems(){
        return basketContents.size();
    }

    public Item getLastItem(){
        return basketContents.get(basketContents.size()-1);


    }





}
