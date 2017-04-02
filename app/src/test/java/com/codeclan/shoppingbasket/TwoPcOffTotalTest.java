package com.codeclan.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TwoPcOffTotalTest {

    TwoPcOffTotal loyaltyOffer;

    @Before
    public void before(){
        loyaltyOffer = new TwoPcOffTotal();
    }

    @Test
    public void canGetOfferName(){
        assertEquals("Loyal Customer Discount: 2% off your total spend", loyaltyOffer.getOfferName());
    }

    @Test
    public void canGetDiscountPercentage(){
        assertEquals(2, loyaltyOffer.getDiscountPercentage());
    }

}
