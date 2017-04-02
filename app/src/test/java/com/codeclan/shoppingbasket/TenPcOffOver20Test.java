package com.codeclan.shoppingbasket;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TenPcOffOver20Test {

    TenPcOffOver20 offer;

    @Before
    public void before(){
        offer = new TenPcOffOver20();
    }

    @Test
    public void canGetOfferName(){
        assertEquals("10% off when you spend over £20", offer.getOfferName());
    }

    @Test
    public void canGetDiscountPercentage(){
        assertEquals(10, offer.getDiscountPercentage());
    }

    @Test
    public void canGetDiscountThreshold(){
        assertEquals(2000, offer.getDiscountThreshold());
    }

}
