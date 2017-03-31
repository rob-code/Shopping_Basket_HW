package com.codeclan.shoppingbasket;


public abstract class TwopcOffTotal implements LoyaltyDiscounts{

    String offerName;
    int discountPercentage;

    public void TwopcOffTotal(String offerName, int discountPercentage){
        this.offerName = offerName;
        this.discountPercentage = discountPercentage;
    }
    @Override
    public String getDiscountName() {
        return offerName;
    }

    @Override
    public int getDiscountPercentage() {
        return discountPercentage;
    }
}
