package com.codeclan.shoppingbasket;


public class TwoPcOffTotal{

    private String offerName;
    private int discountPercentage;

    public void TwoPcOffTotal(String offerName, int discountPercentage){
        this.offerName = offerName;
        this.discountPercentage = discountPercentage;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
