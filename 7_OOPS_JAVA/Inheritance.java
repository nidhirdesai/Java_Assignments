package oopsprograms;

// Parent class
class Vehicle {

	void start() 
	{
		System.out.println("Vehicle is starting");
	}
}

// Child class
class Car extends Vehicle {

	void drive() 
	{
		System.out.println("Car is driving");
	}
}

// Main class
public class Inheritance {

	public static void main(String[] args) {

		// Creating object of child class
		Car c = new Car();

		// Calling parent class method
		c.start();

		// Calling child class method
		c.drive();
	}
}
