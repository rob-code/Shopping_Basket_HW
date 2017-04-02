package com.codeclan.shoppingbasket;


public class TenPcOffOver20 implements UniversalDiscounts {

    private static final String offerName = "10% off when you spend over £20";
    private static final int discountPercentage = 10;
    private static final int discountThreshold = 2000;


    public String getOfferName() {
        return offerName;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public int getDiscountThreshold(){
        return discountThreshold;
    }

}
