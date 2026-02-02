package oopsprograms;

public class ExampleClass {

    public int number = 10;

    public void show() {
        System.out.println("Number: " + number);
    }
}
package oopsprograms;

public class MainClass {

    public static void main(String[] args) {

        ExampleClass obj = new ExampleClass();
        
        PrivateAccessM obj1 = new PrivateAccessM();
        
        obj1.show();
        System.out.print("Number: "+obj1.number);
        System.out.println("Number: "+obj1.num1);
        System.out.println("Number: "+obj1.num2);
        System.out.println("Number: "+obj1.num3);
        obj.show();
    }
}
