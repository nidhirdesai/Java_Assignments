//Raising Exception in Constructor
//Throw an exception in a constructor if invalid values are passed.

package assignmentprograms;

class Student {

    int age;

    Student(int age) throws Exception {
        if (age < 0) {
            throw new Exception("Age cannot be negative");
        }
        this.age = age;
    }

    void display() {
        System.out.println("Age: " + age);
    }
}

public class AQ6 {

    public static void main(String[] args) {

        try {
            Student s1 = new Student(-5);   // Invalid value
            s1.display();
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
//Error: Age cannot be negative
