package com.codeclan.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckOutTest {

    ItemOffers itemOffer;
    Item item1;
    Item item2;
    Item item3;
    Item item4;
    Item item5;
    Item item6;

    Basket basket1;
    Basket basket2;
    Basket basket3;

    LoyaltyDiscounts loyaltyDiscount;
    Customer customer1;
    Customer customer2;

    UniversalDiscounts universalDiscount;
    CheckOut checkOut1;
    CheckOut checkOut2;
    CheckOut checkOut3;
    CheckOut checkOut4;
    CheckOut checkOut5;
    CheckOut checkOut6;


    @Before
    public void before(){

        itemOffer = new BuyOneGetOneFree();

        item1 = new Item("Cheese", 180, itemOffer);
        item2 = new Item("Bread", 120);
        item3 = new Item("Milk", 85);
        item4 = new Item("Champagne", 3200);
        item5 = new Item("Caviar", 2600);
        item6 = new Item("Crackers", 110, itemOffer);

        basket1 = new Basket();

        basket1.addItem(item1);
        basket1.addItem(item2);
        basket1.addItem(item3);
        basket1.addItem(item4);
        basket1.addItem(item5);
        basket1.addItem(item6);
        basket1.addItem(item1);
        basket1.addItem(item6);

        basket2 = new Basket();
        basket2.addItem(item5);

        basket3 = new Basket();
        basket3.addItem(item1);

        loyaltyDiscount = new TwoPcOffTotal();
        customer1 = new Customer("Jane", loyaltyDiscount);
        customer2 = new Customer("Robert");

        universalDiscount = new TenPcOffOver20();
        checkOut1 = new CheckOut(basket1, customer1, universalDiscount);
        checkOut2 = new CheckOut(basket1, universalDiscount);
        checkOut3 = new CheckOut(basket1);
        checkOut4 = new CheckOut(basket2, customer2, universalDiscount);
        checkOut5 = new CheckOut(basket3, customer2, universalDiscount);
        checkOut6 = new CheckOut(basket3, customer1, universalDiscount);
    }

    @Test
    public void canViewAllItemsInBasket(){
        //checkOut1.listBasketContents();
    }

    @Test
    public void canGetNumberOfItemsInBasket(){
        assertEquals(8, checkOut1.numberOfItemsInBasket());
    }

    public void canGetRawTotalOfBasket1(){
        assertEquals(6585, checkOut1.rawTotal());
    }


    @Test
    public void canCheckIfUniversalDiscountExists1(){
        assertEquals(true, checkOut1.hasUniversalDiscount());
    }

    @Test
    public void canCheckIfUniversalDiscountExists2(){
        assertEquals(true, checkOut2.hasUniversalDiscount());
    }

    @Test
    public void canCheckIfUniversalDiscountDoesNotExist(){
        assertEquals(false, checkOut3.hasUniversalDiscount());
    }

    @Test
    public void canCheckIfCustomerIdentityExists(){
        assertEquals(true, checkOut1.hasCustomerIdentity());
    }

    @Test
    public void canCheckIfCustomerIdentityDoesNotExist1(){
        assertEquals(false, checkOut2.hasCustomerIdentity());
    }

    @Test
    public void canCheckIfCustomerIdentityDoesNotExist2(){
        assertEquals(false, checkOut3.hasCustomerIdentity());
    }

    @Test
    public void canCheckIfCustomerIsLoyal(){
        assertEquals(true, checkOut1.customerIsLoyal());
    }

    @Test
    public void canCheckIfCustomerIsNotLoyal(){
        assertEquals(false, checkOut4.customerIsLoyal());
    }

    @Test
    public void canCalculateRawToTal(){
        assertEquals(6585, checkOut1.rawTotal());
    }

    @Test
    public void universalDiscountOverThresholdIsNotApplied(){
        assertEquals(180, checkOut5.rawTotal());
        assertEquals(180, checkOut5.applyDiscounts());
    }

    @Test
    public void universalDiscountOverThresholdIsApplied(){
        assertEquals(2600, checkOut4.rawTotal());
        assertEquals(2340, checkOut4.applyDiscounts());
    }

    @Test
    public void canApplyCustomerLoyaltyDiscountIfLoyal(){
        assertEquals(180, checkOut6.rawTotal());
        assertEquals(177, checkOut6.applyDiscounts());
    }


    @Test
    public void analyseArrayList(){
        checkOut3.analyseArrayList();
    }

}
