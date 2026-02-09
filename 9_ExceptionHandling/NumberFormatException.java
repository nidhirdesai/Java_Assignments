package exceptionhandling;

public class EH3 {

	public static void main(String[] args) {
		
		String s = "hello";
		try {
			int num = Integer.parseInt(s);
			 System.out.println("Number = " + num);
		}
        catch(NumberFormatException e)
		{
        	System.out.println("Cannot convert String to Number");
		}
	}
}
