package arrayprograms;

interface Result{
	
	void calculateAverage();
	void showResult();

}
class Student implements Result{
	int maths,physics,java;
	double average;
	
	Student(int m,int p,int j)
	{
		maths=m;
		physics=p;
		java=j;
	}
	
	public void calculateAverage()
	{
		average=(maths+physics+java)/3.0;
	}
	
	public void showResult()
	{
		System.out.println("Average: "+average);
	}
}
public class Interfaces {

	public static void main(String[] args) {
		
		Student s1=new Student(100,99,98);
		
		 s1.calculateAverage();
	        s1.showResult();

	}

}
