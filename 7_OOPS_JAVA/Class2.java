package oopsprograms;

class Car{
	
	String brand;
	int speed;
	
	void showDetails()
	{
		System.out.println("Car Brand: "+brand);
		System.out.println("Car Speed: "+speed+"km/hr");
	}
}
public class Class1 {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.brand="Mercedes";
		c.speed=120;
		c.showDetails();

	}

}
