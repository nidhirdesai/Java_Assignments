//Develop a function to list all the details of the mobile phones whose priced is between 
//Rs. 15,000/- & Rs. 20,000/- 
//display_mobile_details(int price_ll, int price_ul, ArrayList )
package arraylistprograms;

import java.util.ArrayList;

class Mobile {
    String brand;
    String model;
    double price;
    int ram;

    Mobile(String brand, String model, double price, int ram) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
    }

    void display() {
        System.out.println(brand + " " + model +
                " | Price: " + price +
                " | RAM: " + ram + "GB");
    }
}

public class q4 {

    // Function to display mobiles within price range
    static void display_mobile_details(int price_ll, int price_ul, ArrayList<Mobile> list) {
        for (Mobile m : list) {
            if (m.price >= price_ll && m.price <= price_ul) {
                m.display();
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Mobile> mobiles = new ArrayList<>();

        mobiles.add(new Mobile("Samsung", "Galaxy S23", 75000, 8));
        mobiles.add(new Mobile("Apple", "iPhone 14", 80000, 6));
        mobiles.add(new Mobile("OnePlus", "OnePlus 11", 60000, 12));
        mobiles.add(new Mobile("Xiaomi", "Redmi Note 12", 18000, 6));
        mobiles.add(new Mobile("Realme", "Realme GT", 25000, 8));
        mobiles.add(new Mobile("Vivo", "Vivo V27", 30000, 8));
        mobiles.add(new Mobile("Oppo", "Oppo Reno 8", 28000, 8));
        mobiles.add(new Mobile("Google", "Pixel 7", 65000, 8));
        mobiles.add(new Mobile("Motorola", "Moto G73", 20000, 6));
        mobiles.add(new Mobile("Nokia", "Nokia X30", 32000, 8));

        System.out.println("Mobiles between 15000 and 20000:");
        display_mobile_details(15000, 20000, mobiles);
    }
}
/*
Expected Output:
Mobiles between 15000 and 20000:
Brand: Xiaomi, Model: Redmi Note 12, Price: 18000.0, RAM: 6GB
Brand: Motorola, Model: Moto G73, Price: 20000.0, RAM: 6GB
  */
