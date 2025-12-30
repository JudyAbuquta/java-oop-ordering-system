# Restaurant Ordering System Using Java OOP

## Contributors
- Judy Abuquta
- [Sarah Eid](https://github.com/sarah-eid)
- [Abeer Hussain](https://github.com/abeerahrar)
- Effat University, College of Engineering, Computer Science Department
- Jeddah, Saudi Arabia
  
## Project Overview

This project demonstrates a **console-based restaurant ordering system** implemented entirely in **Java** using **object-oriented programming principles**.
It allows users to interact with a restaurant menu, place orders, calculate totals, and process payments. The project emphasizes clean OOP design with classes responsible for distinct functionalities.

## **Project Objectives**

1. To simulate a real-world **restaurant ordering workflow**, including:

2. Selecting order types **(Dine-in, Takeaway, Delivery)**

3. Adding multiple menu items with quantities

4. Calculating totals including **delivery fees**

5. Generating a **detailed receipt**

6. Processing payment with support for partial payments and change calculation

## **Key Concepts Demonstrated**

1. **Object-Oriented Programming (Java)**

2. Class design and encapsulation (Menu, Order, Bill)

3. Separation of concerns and single responsibility

4. Map-based menu and order management

5. Input validation and error handling

6. Dynamic receipt generation with subtotals and delivery fees


## **Project Structure**
    ├── OrderingSystem.java  # Main program flow / user interface
    └── com/
        ├── Menu.java        # Menu items and prices
        ├── Order.java       # Stores selected items, quantities, and fees
        └── Bill.java        # Calculates totals, prints receipt, processes payment

## **How It Works**
 **OrderingSystem.java**
        Guides the user through selecting an order type
        Accepts menu item selections and quantities
        Captures delivery details for delivery orders
        Calls Bill to print a detailed receipt and handle payment

 **Menu.java**
        Stores menu items and their prices in a map
        Provides getter methods for prices and items

 **Order.java**
    Stores selected items and quantities
    Tracks delivery location, pickup branch, and delivery fees
    Provides getters/setters for encapsulation

 **Bill.java**
    Calculates subtotal for each item
    Adds delivery fee if applicable
    Prints a formatted receipt
    Handles payment input, supports partial payments and calculates change
    Optional: Can implement Payable interface for polymorphic payment handling

Example Receipt:

```
==================== RECEIPT ====================
Item            Qty        Price      Subtotal
-------------------------------------------------
Burger          2          $8.99       $17.98
Coca-Cola       1          $1.50       $1.50
-------------------------------------------------
Delivery Fee:                          $5.00
-------------------------------------------------
TOTAL:                                 $24.48
=================================================
```

## **How to Run**

1. Compile all Java files:
    javac OrderingSystem.java com/*.java

2. Run the program:
    java OrderingSystem

3. Follow prompts to select order type, add items, and process payment
