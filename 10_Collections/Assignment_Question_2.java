// Create an arraylist to store the details of 10 mobile phones.
package arraylistprograms;

import java.util.ArrayList;

class Mobile {
    String brand;
    String model;
    double price;
    int ram;

    // Constructor
    Mobile(String b, String m, double p, int r)
    {
        brand = b;
        model = m;
        price = p;
        ram = r;
    }

    // Method to display mobile details
    void display() {
        System.out.println("Brand: " + brand +
                ", Model: " + model +
                ", Price: " + price +
                ", RAM: " + ram + "GB");
    }
}

public class q2 {

    public static void main(String[] args) {

        // Creating ArrayList to store Mobile objects
        ArrayList<Mobile> mobiles = new ArrayList<>();

        // Hardcoding 10 mobile phone details
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

        // Displaying mobile details
        System.out.println("Mobile Phone Details:");
        for (Mobile m : mobiles) {
            m.display();
        }
    }
}
/*
Expected Output:
Mobile Phone Details:
Brand: Samsung, Model: Galaxy S23, Price: 75000.0, RAM: 8GB
Brand: Apple, Model: iPhone 14, Price: 80000.0, RAM: 6GB
Brand: OnePlus, Model: OnePlus 11, Price: 60000.0, RAM: 12GB
Brand: Xiaomi, Model: Redmi Note 12, Price: 18000.0, RAM: 6GB
Brand: Realme, Model: Realme GT, Price: 25000.0, RAM: 8GB
Brand: Vivo, Model: Vivo V27, Price: 30000.0, RAM: 8GB
Brand: Oppo, Model: Oppo Reno 8, Price: 28000.0, RAM: 8GB
Brand: Google, Model: Pixel 7, Price: 65000.0, RAM: 8GB
Brand: Motorola, Model: Moto G73, Price: 20000.0, RAM: 6GB
Brand: Nokia, Model: Nokia X30, Price: 32000.0, RAM: 8GB */
