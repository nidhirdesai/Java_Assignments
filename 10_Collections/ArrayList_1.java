package arraylistprograms;

import java.util.ArrayList;

public class AL1 {

	public static void main(String[] args) {
		
		ArrayList mylist = new ArrayList();
		
		mylist.add(100);
		mylist.add('N');
		mylist.add("Hello");
		mylist.add(true);
		mylist.add(null);
		
		System.out.println("Data from ArrayList: "+ mylist);
		
		System.out.println("Size of ArrayList: "+mylist.size());
		
		mylist.remove(3);
		System.out.println("After removing from the list: "+mylist);
		
		mylist.add(2,"Nidhi");
		System.out.println("List after Addition: "+mylist);
		
		mylist.set(4, 100);
		System.out.println("List after Updation: "+mylist);
		

	}

}
/*
Expected Output:
Data from ArrayList: [100, N, Hello, true, null]
Size of ArrayList: 5
After removing from the list: [100, N, Hello, null]
List after Addition: [100, N, Nidhi, Hello, null]
List after Updation: [100, N, Nidhi, Hello, 100] */
