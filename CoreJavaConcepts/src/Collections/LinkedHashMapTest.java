package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(1, "Rajesh");
		lhm.put(2, "Pankaj");
		lhm.put(1, "Mahendra");
		lhm.put(3, "Vikas");
		
		System.out.println(lhm);
	}

}
