
package oopsprograms;

public class PrivateAccessM {

    private int number = 20;
    public int num1=10;
    protected int num2=30;
    int num3=40;

    private void show() {
        System.out.println("Private Number: " + number);
    }

    public static void main(String[] args) {

    	PrivateAccessM obj = new PrivateAccessM();

        obj.show();   // Allowed (same class)
    }
}
