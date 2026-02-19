//Develop a function to  list all the details of the mobile phones whose RAM > 6 GB and price is less than 10,000/-
//display_mobile_details(int ram, int price, ArrayList)
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

public class q5 {

    // Function
    static void display_mobile_details(int ram, int price, ArrayList<Mobile> list) {
        for (Mobile m : list) {
            if (m.ram > ram && m.price < price) {
                m.display();
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Mobile> mobiles = new ArrayList<>();

        mobiles.add(new Mobile("Samsung", "Galaxy S23", 75000, 8));
        mobiles.add(new Mobile("Apple", "iPhone 14", 80000, 6));
        mobiles.add(new Mobile("OnePlus", "OnePlus 11", 60000, 12));
        mobiles.add(new Mobile("Xiaomi", "Redmi Note 12", 9000, 8));
        mobiles.add(new Mobile("Realme", "Realme C30", 8000, 4));
        mobiles.add(new Mobile("Vivo", "Vivo Y15", 9500, 8));
        mobiles.add(new Mobile("Oppo", "Oppo A17", 9999, 8));
        mobiles.add(new Mobile("Google", "Pixel 7", 65000, 8));
        mobiles.add(new Mobile("Motorola", "Moto G73", 20000, 6));
        mobiles.add(new Mobile("Nokia", "Nokia C12", 7000, 8));

        System.out.println("Mobiles with RAM > 6GB and Price < 10000:");
        display_mobile_details(6, 10000, mobiles);
    }
}
/*
Expected Output:
Mobiles with RAM > 6GB and Price < 10000:
Brand: Xiaomi, Model: Redmi Note 12, Price: 9000.0, RAM: 8GB
Brand: Vivo, Model: Vivo Y15, Price: 9500.0, RAM: 8GB
Brand: Oppo, Model: Oppo A17, Price: 9999.0, RAM: 8GB
Brand: Nokia, Model: Nokia C12, Price: 7000.0, RAM: 8GB
  */
