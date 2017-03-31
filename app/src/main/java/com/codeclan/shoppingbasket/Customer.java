package com.codeclan.shoppingbasket;

public class Customer {

    private String name;
    private Boolean loyalty;
    private LoyaltyDiscounts loyaltyDiscount;

    public Customer(String name, Boolean loyalty, LoyaltyDiscounts loyaltyDiscount){
        this.name = name;
        this.loyalty = loyalty;
        this.loyaltyDiscount = loyaltyDiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isLoyal() {
        return loyalty;
    }

    public void setLoyalty(Boolean loyal) {
        loyalty = loyal;
    }

    public String getLoyaltyDiscountName(){
        return loyaltyDiscount.getDiscountName();
    }


}
