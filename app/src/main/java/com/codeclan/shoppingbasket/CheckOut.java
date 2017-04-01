package com.codeclan.shoppingbasket;

import java.math.BigDecimal;

public class CheckOut {

    private Basket basket;
    private Customer customer;
    private UniversalDiscounts universalDiscount;
    private BigDecimal total;


    public CheckOut(Basket basket, Customer customer, UniversalDiscounts universalDiscount){
        this.basket = basket;
        this.customer = customer;
        this.universalDiscount = universalDiscount;
    }

    public CheckOut(Basket basket, UniversalDiscounts universalDiscount){
        this.basket = basket;
        this.universalDiscount = universalDiscount;
    }

    public CheckOut(Basket basket){
        this.basket = basket;
    }

    public void listBasketContents(){
        basket.listContents();
    }

    public int numberOfItemsInBasket(){
       return basket.numberOfItems();
    }

    public boolean hasUniversalDiscount(){
        if (this.universalDiscount == null){
            return false;
        }
        return true;
    }

    public boolean hasCustomerIdentity(){
        if(this.customer == null){
            return false;
        }
        return true;
    }

    public boolean customerIsLoyal(){
        if(this.hasCustomerIdentity() == true){
            return customer.isLoyal();
        }
        return false;
    }

    public void calculateTotal() {

//        //calculateBasketTotal
//        for
//
//        //apply universal discount
//        if (hasUniversalDiscount()){
//
//        }
//
//        //apply loyalty discount
//        if (customerIsLoyal()){

//        }
//




    }

}
