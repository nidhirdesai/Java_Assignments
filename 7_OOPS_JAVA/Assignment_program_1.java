package prog;

class Student {

    String name;
    int studentId;
    int marksCC;
    int marksML;
    double average;

    // Parameterized Constructor
    Student(String n, int i, int c, int l) {

        name = n;
        studentId = i;
        marksCC = c;
        marksML = l;

        // Calculate average
        average = (marksCC + marksML) / 2.0;
    }

    // Method to display average
    void displayAverage() {
        System.out.println("The average marks scored by " + name + " is " + average);
    }
}

public class Assignment_1 {

    public static void main(String[] args) {

        // Creating Student objects
        Student s1 = new Student("Rahul", 101, 80, 90);
        Student s2 = new Student("Anita", 102, 85, 95);
        Student s3 = new Student("Karan", 103, 70, 75);

        // Display averages
        s1.displayAverage();
        s2.displayAverage();
        s3.displayAverage();

        // Finding highest scorer
        Student topStudent = s1;

        if (s2.average > topStudent.average) 
        {
            topStudent = s2;
        }

        if (s3.average > topStudent.average) 
        {
            topStudent = s3;
        }

        // Display top student
        System.out.println("\nWith " + topStudent.average + " marks, " +
                           topStudent.name + " is the highest scorer.");
    }
}
