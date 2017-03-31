package com.codeclan.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    LoyaltyDiscounts discount;


    @Before
    public void before(){
        discount = new LoyaltyDiscounts() {
            @Override
            public String getDiscountName() {
                return "bogof";
            }

            @Override
            public int getDiscountPercentage() {
                return 2;
            }
        };
        customer = new Customer("Bill", true, discount);
    }

    @Test
    public void canGetCustomerName(){
        assertEquals("Bill", customer.getName());
    }

    @Test
    public void canSetCustomerName(){
        customer.setName("Norelle");
        assertEquals("Norelle", customer.getName());
    }

    @Test
    public void canCheckIfCustomerIsLoyal(){
        assertEquals(true, customer.isLoyal());
    }


    @Test
    public void canSetCustomerLoyalty(){
        customer.setLoyalty(false);
        assertEquals(false, customer.isLoyal());
    }

    @Test
    public void canGetCustomerLoyaltyOfferName(){
        assertEquals("bogof", customer.getLoyaltyDiscountName());
    }

}
