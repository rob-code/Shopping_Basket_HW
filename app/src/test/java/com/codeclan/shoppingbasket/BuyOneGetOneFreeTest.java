package com.codeclan.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuyOneGetOneFreeTest {

    BuyOneGetOneFree offer;

    @Before
    public void before(){
        offer = new BuyOneGetOneFree();
    }

    @Test
    public void canGetOfferName(){
        assertEquals("Buy One Get One Free", offer.getOfferName());

    }
}
