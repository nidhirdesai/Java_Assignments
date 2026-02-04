package oopsprograms;

// Parent class
class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

// Child class 1
class BOB extends Bank {
    int getRateOfInterest() {
        return 6;
    }
}

// Child class 2
class Canara extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

// Child class 3
class Citi extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

public class Poly {

    public static void main(String[] args) {

        Bank b;   // parent class reference

        b = new BOB();
        System.out.println("BOB Rate of Interest: " + b.getRateOfInterest());

        b = new Canara();
        System.out.println("Canara Rate of Interest: " + b.getRateOfInterest());

        b = new Citi();
        System.out.println("Citi Rate of Interest: " + b.getRateOfInterest());
    }
}
