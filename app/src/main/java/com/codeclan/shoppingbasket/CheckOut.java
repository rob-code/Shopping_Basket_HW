package com.codeclan.shoppingbasket;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CheckOut {

    private Basket basket;
    private Customer customer;
    private UniversalDiscounts universalDiscount;
    int total;
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

    public void printReceiptHeader(){
        System.out.println(" ");
        System.out.println("* Grocery Shop *");
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(sdf.format(date));
        System.out.println(" ");
    }

    public void calculateBasketTotal(){

        this.basketContents = basket.getContents();
        Map<Item, Integer> counts = new HashMap<Item, Integer>();
        for (Item item : basketContents){
            if (counts.containsKey(item)) {
                counts.put(item, counts.get(item) + 1);
            } else {
                counts.put(item, 1);
            }
        }

        printReceiptHeader();

        total = 0;
        double k;
        for (Map.Entry<Item, Integer> entry : counts.entrySet()){
            Item item = entry.getKey();

            if (entry.getValue()>1){

                if (item.hasOffer() == true){

                    k = (double)entry.getValue()/2;
                    long iPart = (long)k;
                    double fPart = k-iPart;

                    double d = 0;
                    if (fPart == 0.5){
                        d = 1;
                    } else {
                        d = 0;
                    }

                    long discount = (long) ((long)(item.getPrice()*entry.getValue()) - ((iPart * item.getPrice()) + (d * item.getPrice())));
                    int amountToPay = item.getPrice()*entry.getValue() - (int) discount;

                    total += amountToPay;

                    System.out.println(entry.getValue() + " x " + item.getName() + " (@ " + item.getPrice() + "/item) Total before discount: " + item.getPrice()*entry.getValue());
                    System.out.println("Offer applied: " + item.getOfferName() + " : Discount = -" + discount);
                    System.out.println("Total to pay after discount applied: " + amountToPay);

                } else {
                    System.out.println(entry.getValue() + " x " + item.getName() + " (@ " + item.getPrice() + "/item) Total: " + item.getPrice()*entry.getValue());
                    total += item.getPrice() * entry.getValue();
                }

            } else {
                System.out.println(+ entry.getValue() + " x " + item.getName() + " price = " + item.getPrice());
                total += item.getPrice();
            }

            System.out.println("Running Total = " + total);
            System.out.println(" ");
        }

        applyDiscounts();

        System.out.println("***** Total To Pay : " + total + " *****");

    }

    public void applyDiscounts(){

        //apply universal discount
        if (hasUniversalDiscount() && total > universalDiscount.getDiscountThreshold()){
            total -= total * universalDiscount.getDiscountPercentage()/100;
            System.out.println("Discount applied : " + universalDiscount.getOfferName());
            System.out.println(" ");
        }

        //apply loyalty discount
        if (customerIsLoyal()){
            total -= total * customer.getDiscountPercentage()/100;
            System.out.println("Discount applied : " + customer.getDiscountName());
            System.out.println(" ");
        }
    }

}
