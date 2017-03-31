package com.codeclan.shoppingbasket;

public class CheckOut {

    Basket basket;
    Customer customer;
    UniversalDiscounts universalDiscount;


    public CheckOut(Basket basket, Customer customer, UniversalDiscounts universalDiscount){
        this.basket = basket;
        this.customer = customer;
        this.universalDiscount = universalDiscount;
    }

    public void listBasketContents(){
        basket.listContents();
    }


}
