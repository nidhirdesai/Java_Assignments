
package oopsprograms;

class DefaultAccessM {   // No public keyword

    int number = 40;     // Default access

    void show() {        // Default access
        System.out.println("Default Number: " + number);
    }

    public static void main(String[] args) {

    	DefaultAccessM obj = new DefaultAccessM();

        obj.show();
    }
}
