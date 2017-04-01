package com.codeclan.shoppingbasket;

/**
 * Created by user on 31/03/2017.
 */

public class TenPcOffOver20 implements UniversalDiscounts {

    private static final String offerName = "10% off when the price is over £20";
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


    //setters are not required beccause we will never change the offer
    //we will only ever create a new offer.

//    public void setOfferName(String offerName) {
//        this.offerName = offerName;
//    }


//    public void setDiscountPercentage(int discountPercentage) {
//        this.discountPercentage = discountPercentage;
//    }




}
