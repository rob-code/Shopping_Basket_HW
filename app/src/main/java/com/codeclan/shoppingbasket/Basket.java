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

    public void removeItemAsObject(Item item){
        int p = basketContents.indexOf(item);
        basketContents.remove(p);
    }

    public void removeItemByName(String name){

        for (int i = 0; i < basketContents.size(); i++){

            Item item = basketContents.get(i);

            if (item.getName().equals(name)){
                int j = basketContents.indexOf(item);
                basketContents.remove(j);
            }

        }
    }


    public void listContents(){
        for (Item item : basketContents){
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }






}
