package oopsprograms;

class Employee{
	public String name;
	protected String dept;
	String compname;
	private int salary;
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Department: "+dept);
		System.out.println("Company Name: "+compname);
		System.out.println("Salary: "+salary);
	}
	
	public void setSalary(int sal)
	{
		if(sal>0)
		{
          salary = sal;
		}
		else
		{
			System.out.println("Invalid Salary");
		}
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name="Nidhi";
		emp.dept="Analytics";
		emp.compname="Capgemini";
		//emp.salary=600000;
		emp.setSalary(600000);
		
		emp.display();

	}

}
