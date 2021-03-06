package com.codeclan.shoppingbasket;


public class Item {

    private String itemName;
    private int price;   //price in pence
    private ItemOffers offer;

    public Item(String itemName, int price, ItemOffers offer){
        this.itemName = itemName;
        this.price = price;
        this.offer = offer;
    }

    public Item(String itemName, int price){
        this.itemName = itemName;
        this.price = price;
    }

    public String getName() {
        return itemName;
    }

    public void setName(String name) {
        this.itemName = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean hasOffer(){
        if (offer != null){
            return true;
        }
        return false;
    }

    public String getOfferName(){
        if (offer == null){
            return "no offer";
        }
        return offer.getOfferName();
    }

}
