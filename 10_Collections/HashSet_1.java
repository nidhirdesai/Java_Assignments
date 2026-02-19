package arraylistprograms;

import java.util.HashSet;
import java.util.ArrayList;

public class HS1 {

	public static void main(String[] args) {
		
		HashSet myset =new HashSet();
		myset.add(100);
		myset.add(99.99);
		myset.add("Hello");
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);
		
		myset.remove(null);
		System.out.println("HashSet after removing: "+myset);
		
		//Converting HashSet to ArrayList
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));

	}

}
/*
Expected Output:
[null, A, 100, Hello, 99.99]
HashSet after removing: [A, 100, Hello, 99.99]
[A, 100, Hello, 99.99]
Hello */
