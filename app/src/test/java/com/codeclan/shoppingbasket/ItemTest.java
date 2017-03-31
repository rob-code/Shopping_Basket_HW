package com.codeclan.shoppingbasket;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {

    Item item1;

    @Before
    public void before(){
        item1 = new Item("Cheese", 150);
    }

    @Test
    public void canGetItemName(){
        assertEquals("Cheese", item1.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(150, item1.getPrice());
    }

    @Test
    public void canSetName(){
        item1.setName("Tomato");
        assertEquals("Tomato", item1.getName());
    }

    @Test
    public void canSetPrice(){
        item1.setPrice(2000);
        assertEquals(2000, item1.getPrice());
    }












}
