package com.codeclan.shoppingbasket;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CheckOut {

    private Basket basket;
    private Customer customer;
    private UniversalDiscounts universalDiscount;
    private BigDecimal total;
    private ArrayList<Item> basketContents;


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

    public int rawTotal() {
        this.basketContents = basket.getContents();
        int totalCost = 0;
        for (Item item : basketContents){
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public int applyDiscounts(){

        int totalWithDiscounts = this.rawTotal();

        //apply bogof


        //apply universal discount
        if (hasUniversalDiscount() && this.rawTotal() > universalDiscount.getDiscountThreshold()){
            totalWithDiscounts -= totalWithDiscounts * universalDiscount.getDiscountPercentage()/100;
        }

        //apply loyalty discount
        if (customerIsLoyal()){
            totalWithDiscounts -= totalWithDiscounts * customer.getDiscountPercentage()/100;
        }
        return totalWithDiscounts;
    }


}
