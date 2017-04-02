# Shopping Basket 


1. All offers are made available to Items, Customers and the Checkout via an interface

2. When there are no offers for Items, Customers and the Checkout, they are dealt with by overloading the constructor: so for example we can make a Customer with a name only or with a name and an offer

3. Could have made another package for all discount objects and another for the interfaces. I chose discount objects rather than enums because the discount objects may have to contain more complex operations than just the carrying of values. 

I also could have stripped out the 3 interfaces and just have one. However there may be cases where discounts have different method signatures depending on the level at which they are applied. 

Although the model becomes a bit complex, I did it this way to reinforce the scalability of the program, and to get clear on implementing interfaces and method/constructor overloading.

The beauty of this is that when it comes to controlling everything it becomes much easier at the checkout.

4. Rather than the overkill of using enums for constants in offer classes, the offer instance variables are made constant and encapsulated using private static final. The values are available through their getters. 

# Further Work

1. Sort number data type to properly handle money: BigDecimal
2. Separate out the view (till receipt) from the controller calculation of the bill.


