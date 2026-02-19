package arraylistprograms;

import java.util.HashMap;

public class HM2 {

	public static void main(String[] args) {
		
HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101,"Anna");
		hm.put(102,"John");
		hm.put(103,"Mary");
		hm.put(104,"Scott");
		hm.put(105,"David");
		
		for(int k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());
	}
}
/*
Expected Output:
101 Anna
102 John
103 Mary
104 Scott
105 David
true */
