/*1) Display Products() : this should display the following menu:
| Product ID | Product Name	| Available Units | Unit Price | Brand |
| 101	     | Mobile-Samsung	|  2		  |  12000     |       |		
| 102	     | Mobile-Vivo	|  5		  |  13500     |
| 103	     | Exit		|		  |	       |
Enter the product id you want to purchase : 101
Enter the number of units you want to purchase : 1
Note : display the above product list(with modified number of units) again until the user selects 103 : Exit*/
package arraylistprograms;

public class product {

    int Product_ID;
    int Price;
    int Quantity;
    String Product_Name;
    String Brand;

    public product(int Product_ID, int Price, int Quantity, String Product_Name, String Brand) {
        this.Product_ID = Product_ID;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Product_Name = Product_Name;
        this.Brand = Brand;
    }
}
package arraylistprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create HashMap
        Map<Integer, product> product_map = new HashMap<Integer, product>();

        // Add 10 products
        product_map.put(101, new product(101, 12000, 2, "Mobile-Samsung", "Samsung"));
        product_map.put(102, new product(102, 13500, 5, "Mobile-Vivo", "Vivo"));
        product_map.put(104, new product(104, 45000, 3, "Laptop-HP", "HP"));
        product_map.put(105, new product(105, 30000, 4, "Laptop-Dell", "Dell"));
        product_map.put(106, new product(106, 1500, 10, "Headphones", "Boat"));
        product_map.put(107, new product(107, 800, 8, "Keyboard", "Logitech"));
        product_map.put(108, new product(108, 700, 6, "Mouse", "HP"));
        product_map.put(109, new product(109, 25000, 2, "Tablet", "Samsung"));
        product_map.put(110, new product(110, 6000, 7, "Smart Watch", "Noise"));
        product_map.put(111, new product(111, 2000, 5, "Power Bank", "MI"));

        int choice;

        while (true) {

            System.out.println("\n------------------------------------------------------------");
            System.out.println("Product ID | Product Name | Available Units | Unit Price | Brand");
            System.out.println("------------------------------------------------------------");

            for (Integer pid : product_map.keySet()) 
            {
                product p = product_map.get(pid);
                System.out.println(p.Product_ID + " | "
                        + p.Product_Name + " | "
                        + p.Quantity + " | "
                        + p.Price + " | "
                        + p.Brand);
            }

            System.out.println("103 | Exit");
            System.out.println("------------------------------------------------------------");

            System.out.print("Enter the product id you want to purchase: ");
            choice = sc.nextInt();
            
            

            if (choice == 103) 
            {
                System.out.println("Thank you for shopping!");
                break;
            }
            
            

            if (product_map.containsKey(choice)) 
            {

                product selectedProduct = product_map.get(choice);

                System.out.print("Enter number of units you want to purchase: ");
                int units = sc.nextInt();

                if (units <= selectedProduct.Quantity) 
                {

                    selectedProduct.Quantity = selectedProduct.Quantity - units;

                    System.out.println("Purchase Successful!");
                } 
                else
                {
                    System.out.println("Not enough stock available!");
                }

            } 
            else 
            {
                System.out.println("Invalid Product ID!");
            }
        }

        sc.close();
    }
}
/* Expected Output:
------------------------------------------------------------
Product ID | Product Name | Available Units | Unit Price | Brand
------------------------------------------------------------
101 | Mobile-Samsung | 2 | 12000 | Samsung
102 | Mobile-Vivo | 5 | 13500 | Vivo
104 | Laptop-HP | 3 | 45000 | HP
105 | Laptop-Dell | 4 | 30000 | Dell
106 | Headphones | 10 | 1500 | Boat
107 | Keyboard | 8 | 800 | Logitech
108 | Mouse | 6 | 700 | HP
109 | Tablet | 2 | 25000 | Samsung
110 | Smart Watch | 7 | 6000 | Noise
111 | Power Bank | 5 | 2000 | MI
103 | Exit
------------------------------------------------------------
Enter the product id you want to purchase: 101
Enter number of units you want to purchase: 2
Purchase Successful!

------------------------------------------------------------
Product ID | Product Name | Available Units | Unit Price | Brand
------------------------------------------------------------
101 | Mobile-Samsung | 0 | 12000 | Samsung
102 | Mobile-Vivo | 5 | 13500 | Vivo
104 | Laptop-HP | 3 | 45000 | HP
105 | Laptop-Dell | 4 | 30000 | Dell
106 | Headphones | 10 | 1500 | Boat
107 | Keyboard | 8 | 800 | Logitech
108 | Mouse | 6 | 700 | HP
109 | Tablet | 2 | 25000 | Samsung
110 | Smart Watch | 7 | 6000 | Noise
111 | Power Bank | 5 | 2000 | MI
103 | Exit
------------------------------------------------------------
Enter the product id you want to purchase: 101
Enter number of units you want to purchase: 1
Not enough stock available!

------------------------------------------------------------
Product ID | Product Name | Available Units | Unit Price | Brand
------------------------------------------------------------
101 | Mobile-Samsung | 0 | 12000 | Samsung
102 | Mobile-Vivo | 5 | 13500 | Vivo
104 | Laptop-HP | 3 | 45000 | HP
105 | Laptop-Dell | 4 | 30000 | Dell
106 | Headphones | 10 | 1500 | Boat
107 | Keyboard | 8 | 800 | Logitech
108 | Mouse | 6 | 700 | HP
109 | Tablet | 2 | 25000 | Samsung
110 | Smart Watch | 7 | 6000 | Noise
111 | Power Bank | 5 | 2000 | MI
103 | Exit
------------------------------------------------------------
Enter the product id you want to purchase: 103
Thank you for shopping!
*/
