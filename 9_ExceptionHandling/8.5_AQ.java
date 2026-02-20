// Exception Propagation
//Demonstrate exception propagation in a method call stack.
package assignmentprograms;

public class AQ2 {

    // Method 1 (will cause exception)
    static void method3() {
        int result = 10 / 1;   // Exception occurs here   //e4
        System.out.println(result);
        System.out.println("Final method");
    }

    // Method 2 (calls method3)
    static void method2() {
        method3();  //E3
        System.out.println("Exception propagated from Method 3 to Method 2");// Exception propagates here
    }

    // Method 1 (calls method2)
    static void method1() {
        method2(); //E2
        System.out.println("Method proagated to Method 2");
        // Exception propagates here
    }

    public static void main(String[] args) {

        try {
            method1();   // Start of call stack  "E1"
            
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled in main()");
        }

        System.out.println("Program continues normally...");
    }
}
/*
10
Final method
Exception propagated from Method 3 to Method 2
Method proagated to Method 2
Program continues normally...*/
