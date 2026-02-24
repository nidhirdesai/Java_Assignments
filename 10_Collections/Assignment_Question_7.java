/*
Display the bill to the purchaser. 
| Product Name   | Unit Price | Qty | Total | 
| Mobile-Samsung |	      | 1   |  	
| T-Shirt	 |   450      | 2   | 	 
| Total Discount
| Final Amount

Discounts & Offers:
-------------------
If the bill is more than Rs. 25000/-, 20% discount on  the total bill.
If the bill is between 15,000/- and 25000/- 10% discount on  the total bill.
If 3 t-shirts are purchased, 10% discount. 
*/
package arraylistprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, product> product_map = new HashMap<Integer, product>();

        // Add products
        product_map.put(101, new product(101, 12000, 5, "Mobile-Samsung", "Samsung"));
        product_map.put(102, new product(102, 13500, 5, "Mobile-Vivo", "Vivo"));
        product_map.put(103, new product(103, 450, 10, "T-Shirt", "Puma"));
        product_map.put(104, new product(104, 30000, 3, "Laptop-HP", "HP"));

        double totalBill = 0;
        double discount = 0;

        // To store purchased T-shirt quantity
        int tshirtQty = 0;

        while (true) {

            System.out.println("\n--------------------------------------------");
            System.out.println("Product ID | Product Name | Units | Price");
            System.out.println("--------------------------------------------");

            for (Integer pid : product_map.keySet()) {
                product p = product_map.get(pid);
                System.out.println(p.Product_ID + " | "
                        + p.Product_Name + " | "
                        + p.Quantity + " | "
                        + p.Price);
            }

            System.out.println("0 | Generate Bill & Exit");
            System.out.println("--------------------------------------------");

            System.out.print("Enter product id: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            if (product_map.containsKey(choice)) {

                product selected = product_map.get(choice);

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                if (qty <= selected.Quantity) {

                    double itemTotal = qty * selected.Price;
                    totalBill = totalBill + itemTotal;

                    selected.Quantity = selected.Quantity - qty;

                    // Count T-shirt quantity
                    if (selected.Product_Name.equals("T-Shirt")) {
                        tshirtQty = tshirtQty + qty;
                    }

                    System.out.println("Added to cart!");

                } else {
                    System.out.println("Not enough stock!");
                }

            } else {
                System.out.println("Invalid Product ID!");
            }
        }

        // -----------------------
        // DISCOUNT CALCULATION
        // -----------------------

        if (totalBill > 25000) {
            discount = totalBill * 0.20;
        } else if (totalBill >= 15000 && totalBill <= 25000) {
            discount = totalBill * 0.10;
        }

        // Extra discount for T-shirt
        if (tshirtQty >= 3) {
            discount = discount + (totalBill * 0.10);
        }

        double finalAmount = totalBill - discount;

        // -----------------------
        // BILL DISPLAY
        // -----------------------

        System.out.println("\n=========== BILL ===========");
        System.out.println("Total Amount : Rs. " + totalBill);
        System.out.println("Total Discount : Rs. " + discount);
        System.out.println("Final Amount : Rs. " + finalAmount);
        System.out.println("============================");

        sc.close();
    }
}
/*
--------------------------------------------
Product ID | Product Name | Units | Price
--------------------------------------------
101 | Mobile-Samsung | 5 | 12000
102 | Mobile-Vivo | 5 | 13500
103 | T-Shirt | 10 | 450
104 | Laptop-HP | 3 | 30000
0 | Generate Bill & Exit
--------------------------------------------
Enter product id: 101
Enter quantity: 3
Added to cart!

--------------------------------------------
Product ID | Product Name | Units | Price
--------------------------------------------
101 | Mobile-Samsung | 2 | 12000
102 | Mobile-Vivo | 5 | 13500
103 | T-Shirt | 10 | 450
104 | Laptop-HP | 3 | 30000
0 | Generate Bill & Exit
--------------------------------------------
Enter product id: 104
Enter quantity: 2
Added to cart!

--------------------------------------------
Product ID | Product Name | Units | Price
--------------------------------------------
101 | Mobile-Samsung | 2 | 12000
102 | Mobile-Vivo | 5 | 13500
103 | T-Shirt | 10 | 450
104 | Laptop-HP | 1 | 30000
0 | Generate Bill & Exit
--------------------------------------------
Enter product id: 0

=========== BILL ===========
Total Amount : Rs. 96000.0
Total Discount : Rs. 19200.0
Final Amount : Rs. 76800.0
============================
*/
