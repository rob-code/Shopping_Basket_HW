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

    Basket basket;

    LoyaltyDiscounts loyaltyDiscount;
    Customer customer1;
    Customer customer2;

    UniversalDiscounts universalDiscount;
    CheckOut checkOut1;
    CheckOut checkOut2;
    CheckOut checkOut3;
    CheckOut checkOut4;

    @Before
    public void before(){

        item1 = new Item("Cheese", 180, itemOffer);
        item2 = new Item("Bread", 120);
        item3 = new Item("Milk", 85);
        item4 = new Item("Champagne", 3200);
        item5 = new Item("Caviar", 2600);
        item6 = new Item("Crackers", 110, itemOffer);

        basket = new Basket();

        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.addItem(item4);
        basket.addItem(item5);
        basket.addItem(item6);
        basket.addItem(item1);
        basket.addItem(item6);

        loyaltyDiscount = new TwoPcOffTotal();
        customer1 = new Customer("Jane", loyaltyDiscount);
        customer2 = new Customer("Robert");

        universalDiscount = new TenPcOffOver20();
        checkOut1 = new CheckOut(basket, customer1, universalDiscount);
        checkOut2 = new CheckOut(basket, universalDiscount);
        checkOut3 = new CheckOut(basket);
        checkOut4 = new CheckOut(basket, customer2, universalDiscount);
    }

    @Test
    public void canViewAllItemsInBasket(){
        checkOut1.listBasketContents();
    }

    @Test
    public void canGetNumberOfItemsInBasket(){
        assertEquals(8, checkOut1.numberOfItemsInBasket());
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


//    @Test
//    public void canCalculateTotalAmount(){
//
//    }

}
