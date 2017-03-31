package com.codeclan.shoppingbasket;



public class Customer {


    private String name;
    private Boolean loyalty;

    public Customer(String name, Boolean loyalty){
        this.name = name;
        this.loyalty = loyalty;
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
}
