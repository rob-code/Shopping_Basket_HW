package com.codeclan.shoppingbasket;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {

    Item item1;
    Item item2;
    ItemOffers offer;

    @Before
    public void before(){
        offer = new BuyOneGetOneFree();
        item1 = new Item("Cheese", 150, offer);
        item2 = new Item("Bread", 200);
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

    @Test
    public void canGetOfferName(){
        assertEquals("Buy One Get One Free", item1.getOfferName());
    }

    @Test
    public void canGetCaseWhenThereIsNoOffer(){
        assertEquals("no offer", item2.getOfferName());
    }

    @Test
    public void canDoBooleanTestForOfferWhenThereIsNoOffer(){
        assertEquals(false,item2.hasOffer());
    }

    @Test
    public void canDoBooleanTestForOfferWhenThereIsAnOffer(){
        assertEquals(true,item1.hasOffer());
    }






}
