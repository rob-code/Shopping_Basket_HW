package com.codeclan.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Bill", true);
    }

    @Test
    private void canGetCustomerName(){
        assertEquals("Bill", customer.getName());
    }

    @Test
    private void canSetCustomerName(){
        customer.setName("Norelle");
        assertEquals("Norelle", customer.getName());
    }

    @Test
    private void canCheckIfCustomerIsLoyal(){
        assertEquals(true, customer.isLoyal());
    }


    @Test
    private void canSetCustomerLoyalty(){
        customer.setLoyalty(false);
        assertEquals(false, customer.isLoyal());
    }


}
