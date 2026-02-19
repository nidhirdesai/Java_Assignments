package arraylistprograms;

import java.util.HashSet;
import java.util.Iterator;

public class HS2 {

	public static void main(String[] args) {
		
		HashSet myset1 =new HashSet();
		myset1.add(100);
		myset1.add(99.99);
		myset1.add("Hello");
		myset1.add('A');
		myset1.add(100);
		myset1.add(null);
		myset1.add(null);
		
		System.out.println(myset1);
		
		System.out.println("Size of HashSet: "+myset1.size());
		
		for(Object x:myset1)
		{
			System.out.print(x+" ");
		}

		Iterator <Object>it=myset1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		myset1.clear();
		System.out.println(myset1.isEmpty());
		
	}

}
/*
Expected Output:
[null, A, 100, Hello, 99.99]
Size of HashSet: 5
null A 100 Hello 99.99 null
A
100
Hello
99.99
true */
