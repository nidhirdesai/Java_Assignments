//1) Create a arraylist to store the details of 5 students(student name & student id).
package arraylistprograms;

import java.util.ArrayList;

class Student {
    String name;
    int id;

    // Constructor
    Student(String n, int i)
    {
       name = n;
       id = i;
    }

    // Method to display student details
    void display() 
    {
        System.out.println("Student Name: " + name + ", Student ID: " + id);
    }
}

public class q1 {

    public static void main(String[] args) {

        // Creating ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Adding 5 students
        students.add(new Student("Neha", 101));
        students.add(new Student("Rahul", 102));
        students.add(new Student("Priya", 103));
        students.add(new Student("Amit", 104));
        students.add(new Student("Shreya", 105));

        // Displaying student details
        System.out.println("Student Details:");
        for (Student s : students) 
        {
            s.display();
        }
    }
}
/*
Expected Output:
Student Details:
Student Name: Neha, Student ID: 101
Student Name: Rahul, Student ID: 102
Student Name: Priya, Student ID: 103
Student Name: Amit, Student ID: 104
Student Name: Shreya, Student ID: 105 */
