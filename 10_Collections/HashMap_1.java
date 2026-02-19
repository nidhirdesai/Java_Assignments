package arraylistprograms;

import java.util.HashMap;

public class HM1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101,"Anna");
		hm.put(102,"John");
		hm.put(103,"Mary");
		hm.put(104,"Scott");
		hm.put(105,"David");
		
		System.out.println(hm); //Print as a list
		
		System.out.println("Size of HashMap: "+hm.size());
		
		hm.remove(103);
		System.out.println("HashMap after removing: "+hm);
		
		System.out.println(hm.get(102));
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet()); //Print as a Set
		
	}

}
/*
Expected Output:
John
[101, 102, 104, 105]
[Anna, John, Scott, David]
[101=Anna, 102=John, 104=Scott, 105=David] */
