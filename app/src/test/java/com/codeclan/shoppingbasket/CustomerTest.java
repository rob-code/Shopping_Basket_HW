package com.codeclan.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer1;
    Customer customer2;
    TwoPcOffTotal loyaltyDiscount;

    @Before
    public void before(){
        loyaltyDiscount = new TwoPcOffTotal();
        customer1 = new Customer("Bill", loyaltyDiscount);
        customer2 = new Customer("Jane");

    }

    @Test
    public void canGetCustomerName(){
        assertEquals("Bill", customer1.getName());
    }

    @Test
    public void canSetCustomerName(){
        customer1.setName("Norelle");
        assertEquals("Norelle", customer1.getName());
    }

    @Test
    public void canCheckIfCustomerIsLoyal(){
        assertEquals(true, customer1.isLoyal());
    }

    @Test
    public void canGetDiscountName(){
        assertEquals("2% Off Your Total Spend", customer1.getDiscountName());
    }

    @Test
    public void canGetDiscountPercentage(){
        assertEquals(2, customer1.getDiscountPercentage());
    }

    @Test
    public void canFindIfCustomerHasNoLoyaltyCard(){
        assertEquals(false, customer2.isLoyal());
    }

    @Test
    public void canGetCustomerNameWhenTheyHaveNoLoyaltyCard(){
        assertEquals("Jane", customer2.getName());
    }

}
