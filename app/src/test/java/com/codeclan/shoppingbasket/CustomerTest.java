package com.codeclan.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    TwoPcOffTotal loyaltyDiscount;

    @Before
    public void before(){
        loyaltyDiscount = new TwoPcOffTotal();
        customer = new Customer("Bill", true, loyaltyDiscount);
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
    public void canGetDiscountName(){
        assertEquals("bogof", customer.getDiscountName());
    }

    @Test
    public void canGetDiscountPercentage(){
        assertEquals(2, customer.getDiscountPercentage());
    }



}
