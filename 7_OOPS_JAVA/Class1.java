package oopsprograms;

class Student{
	
	String name;   //Data Variable
	int age;       //Data Variable
	
	void display()   //Member Function
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

public class Class {

	public static void main(String[] args) {
		
		Student s1 = new Student();  //Creating Object
		
		s1.name = "Nidhi";
		s1.age = 21;
		s1.display();

	}
}
