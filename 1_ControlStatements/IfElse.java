package practiceprograms;

public class ifelse {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 20;

        if (a < b && a < c) {
            System.out.println("Smallest number is: " + a);
        } else if (b < a && b < c) {
            System.out.println("Smallest number is: " + b);
        } else {
            System.out.println("Smallest number is: " + c);
        }
    }
}
