package MapsInJava;

import java.util.HashMap;

public class PrintKeyAndValuesUsingMap {
	public static void main(String[] args) {
		  HashMap<Integer,String> hm=new HashMap<>();
	        hm.put(111,"Test");
	        hm.put(112,"QA");
	        hm.put(113,"Dev");
	        hm.put(114,"Mgr");
	        for(int x:hm.keySet()) {
	        	System.out.println(x+":"+hm.get(x));
	        	if(x==111) {
	        		hm.put(x,"QA111");
	        	}
	        }
	    System.out.println(hm);
	}
}
