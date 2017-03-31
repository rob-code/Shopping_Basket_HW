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
        assertEquals("2% Off Your Total Spend", loyaltyOffer.getOfferName());
    }

    @Test
    public void canSetOfferName(){
        loyaltyOffer.setOfferName("bigIncentive");
        assertEquals("bigIncentive", loyaltyOffer.getOfferName());
    }

    @Test
    public void canGetDiscountPercentage(){
        assertEquals(2, loyaltyOffer.getDiscountPercentage());
    }

    @Test
    public void canSetDiscountPercentage(){
        loyaltyOffer.setDiscountPercentage(4);
        assertEquals(4, loyaltyOffer.getDiscountPercentage());
    }



}
