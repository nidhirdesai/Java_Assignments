package arraylistprograms;

import java.util.ArrayList;

public class AL3 {

	public static void main(String[] args) {
		
ArrayList mylist2 = new ArrayList();
		
		mylist2.add(10);
		mylist2.add('V');
		mylist2.add("World");
		mylist2.add(false);
		mylist2.add(99.99);
		
		System.out.println("Is ArrayList empty? "+mylist2.isEmpty());
		
		ArrayList mylist3 = new ArrayList();
		
		mylist3.add("World");
		mylist3.add(false);
		
		System.out.println("Data from ArrayList: "+ mylist2);
		
		mylist2.removeAll(mylist3);
		System.out.println("ArrayList after removing elements: "+mylist2);
		
		mylist2.clear();
		System.out.println("Is ArrayList empty? "+mylist2.isEmpty());

	}

}
/*
Expected Output:
Is ArrayList empty? false
Data from ArrayList: [10, V, World, false, 99.99]
ArrayList after removing elements: [10, V, 99.99]
Is ArrayList empty? true
*/
