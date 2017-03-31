package com.codeclan.shoppingbasket;

public class Customer {

    private String name;
    private LoyaltyDiscounts loyaltyDiscount;


    public Customer(String name, LoyaltyDiscounts loyaltyDiscount){
        this.name = name;
        this.loyaltyDiscount = loyaltyDiscount;
    }

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isLoyal() {
        if (loyaltyDiscount != null){
            return true;
        }
            return false;
    }

    public String getDiscountName(){
        if (loyaltyDiscount == null){
            return "no discount";
        }
        return loyaltyDiscount.getOfferName();
    }

    public int getDiscountPercentage(){
        return loyaltyDiscount.getDiscountPercentage();
    }

}
