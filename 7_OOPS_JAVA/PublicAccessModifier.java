package oopsprograms;

public class PublicAccessM {

    public int number = 10;

    public void show() {
        System.out.println("Public Number: " + number);
    }

    public static void main(String[] args) {

    	PublicAccessM obj = new PublicAccessM();

        obj.show();
    }
}
