package com.codeclan.shoppingbasket;

/**
 * Created by user on 31/03/2017.
 */

public class TenPcOffOver20 implements AllCustomerDiscounts{

    String offerName = "10% off when the price is over £20";
    int discountPercentage = 10;


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
