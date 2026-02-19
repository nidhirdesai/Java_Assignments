//Develop a function to list all the details of the mobile phones belonging to the "Samsung" brand.
//find_mobile_by_brand(String brand_name)
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

public class q3 {

    // Simple function
    static void find_mobile_by_brand(ArrayList<Mobile> list, String brand_name) {
        for (Mobile m : list) {
            if (m.brand.equals(brand_name)) {
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

        System.out.println("Samsung Mobiles:");
        find_mobile_by_brand(mobiles, "Samsung");
    }
}
/*
Expected Output:
Samsung Mobiles:
Brand: Samsung, Model: Galaxy S23, Price: 75000.0, RAM: 8GB
*/
