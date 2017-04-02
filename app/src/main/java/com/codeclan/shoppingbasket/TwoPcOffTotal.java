package com.codeclan.shoppingbasket;


public class TwoPcOffTotal implements LoyaltyDiscounts{

    private static final String offerName = "Loyal Customer Discount: 2% off your total spend";
    private static final int discountPercentage = 2;

    public String getOfferName() {
        return offerName;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

}
