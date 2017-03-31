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

    CheckOut checkOut;

    @Before
    public void before(){

        item1 = new Item("Cheese", 180, itemOffer);
        item2 = new Item("Bread", 120);
        item3 = new Item("Milk", 85);
        item4 = new Item("Champagne", 3200);
        item5 = new Item("Caviar", 2600);
        item6 = new Item("Crackers", 110, itemOffer);

        loyaltyDiscount = new TwoPcOffTotal();
        customer1 = new Customer("Jane", loyaltyDiscount);
        customer2 = new Customer("Robert");

        basket = new Basket();

        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.addItem(item4);
        basket.addItem(item5);
        basket.addItem(item6);

    }

    @Test
    public void canViewAllItemsInBasket(){
        basket.listContents();
    }

}
