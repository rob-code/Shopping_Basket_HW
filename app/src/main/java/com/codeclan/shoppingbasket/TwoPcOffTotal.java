package com.codeclan.shoppingbasket;


public class TwoPcOffTotal implements LoyaltyDiscounts{

    private String offerName = "bogof";
    private int discountPercentage = 2;

    public String getOfferName() {
        return offerName;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }



    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
