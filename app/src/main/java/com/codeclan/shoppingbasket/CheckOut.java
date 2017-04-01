package com.codeclan.shoppingbasket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public void analyseArrayList(){
        this.basketContents = basket.getContents();
        Map<Item, Integer> counts = new HashMap<Item, Integer>();
        for (Item item : basketContents){
            if (counts.containsKey(item)) {
                counts.put(item, counts.get(item) + 1);
            } else {
                counts.put(item, 1);
            }
        }

        int total = 0;
        double k;
        for (Map.Entry<Item, Integer> entry : counts.entrySet()){
            Item item = entry.getKey();

            if (entry.getValue()>1){

                if (item.hasOffer() == true){

                    System.out.println(item.getName() + " has a count of " + entry.getValue() + ". Offer = " + item.hasOffer());

                    k = (double)entry.getValue()/2;
                    //get positive and decimal parts of the number
                    System.out.println("k = " + k + " and k % 2 = " + (k % 2));

                    total = total;

                } else {
                    System.out.println(item.getName() + " has a count of " + entry.getValue() + ". Offer = " + item.hasOffer());
                    total += item.getPrice() * entry.getValue();
                }

            } else {
                System.out.println(item.getName() + " has a count of " + entry.getValue() + " so any offer does not apply");
                total += item.getPrice();
            }
            System.out.println(entry.getKey() + " = " + entry.getValue() + " Total = " + total);

        }

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
