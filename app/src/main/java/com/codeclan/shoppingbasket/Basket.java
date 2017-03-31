package com.codeclan.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 31/03/2017.
 */

public class Basket {

    ArrayList<Item> contents;

    public Basket(){
        this.contents = new ArrayList<Item>();
    }

    public void addItem(Item item){
        Item itemToAdd = item;
        contents.add(itemToAdd);
    }

    public int numberOfItems(){
        return contents.size();
    }

    public Item getLastItem(){
        return contents.get(contents.size()-1);
    }

    public void removeItemAsObject(Item item){
        int p = contents.indexOf(item);
        contents.remove(p);
    }

    public void removeItemByName(String name){

        //interesting! cannot use the iterator if I wish to remove an item
        //get a concurrent use error

        for (int i = 0; i < contents.size(); i++){

            Item item = contents.get(i);

            if (item.getName().equals(name)){
                int j = contents.indexOf(item);
                contents.remove(j);
            }

        }
    }

    public void removeAllItems(){
        contents.clear();
    }


    public void listContents(){
        for (Item item : contents){
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }






}
