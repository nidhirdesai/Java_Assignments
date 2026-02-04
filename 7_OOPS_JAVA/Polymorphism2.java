package oopsprograms;

class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Main class
public class Polymorphism1 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling different add() methods
        System.out.println("Add 2 ints: " + calc.add(10, 20));
        System.out.println("Add 3 ints: " + calc.add(10, 20, 30));
        System.out.println("Add 2 doubles: " + calc.add(5.5, 2.5));
    }
}
