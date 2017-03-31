package com.codeclan.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BasketTest{

    Item item1;
    Item item2;
    Basket basket;
    ArrayList<Item> contents;

    @Before
    public void before(){
        item1 = new Item("Bread", 1500);
        item2 = new Item("Milk", 90);
        basket = new Basket();
        basket.addItem(item1);
        basket.addItem(item2);
    }

    @Test
    public void canGetNumberOfItemsInBasket(){
        assertEquals(2, basket.numberOfItems());
    }

    @Test
    public void canRemoveItemAsObject(){
        basket.removeItemAsObject(item1);
        assertEquals(1, basket.numberOfItems());
    }

    @Test
    public void canRemoveItemByName(){
        basket.removeItemByName("Milk");
        assertEquals(1, basket.numberOfItems());
    }

    @Test
    public void canRemoveAllItemsFromBasket(){
        basket.removeContents();
        assertEquals(0, basket.numberOfItems());
    }

    @Test
    public void canGetBasketContents(){
        contents = new ArrayList<Item>();
        contents = basket.getContents();
        assertEquals(2, contents.size());


    }


}
