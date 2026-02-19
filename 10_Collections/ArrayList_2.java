package arraylistprograms;

import java.util.ArrayList;
import java.util.Iterator;


public class AL2 {

	public static void main(String[] args) {
		
ArrayList mylist1 = new ArrayList();
		
		mylist1.add(10);
		mylist1.add('V');
		mylist1.add("World");
		mylist1.add(false);
		mylist1.add(99.99);
		
       //Normal for loop
		System.out.println("Using For Loop:");
		for(int i=0;i<mylist1.size();i++)
		{
			System.out.print(mylist1.get(i)+" ");
		}
		
		//Enhanced loop
		System.out.println("\nUsing Enhanced Loop:");
		for(Object x:mylist1)
		{
			System.out.print(x+" ");
		}
		
		//Iterator
		System.out.println("\nUsing Iteration:");
		Iterator it = mylist1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}
/*
Expected Output:
Using For Loop:
10 V World false 99.99 
Using Enhanced Loop:
10 V World false 99.99 
Using Iteration:
10 V World false 99.99  */
