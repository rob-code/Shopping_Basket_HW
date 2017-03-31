package com.codeclan.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BasketTest{

    Item item1;
    Item item2;
    Basket basket;

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








}
