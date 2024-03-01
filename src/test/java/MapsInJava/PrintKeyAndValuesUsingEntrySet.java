package MapsInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintKeyAndValuesUsingEntrySet {
	public static void main(String[] args) {
		  HashMap hm=new HashMap();
	        hm.put(111,"Test");
	        hm.put(112,"QA");
	        hm.put(113,"Dev");
	        hm.put(114,"Mgr");
	        Set es=hm.entrySet();
	        Iterator itr=es.iterator();
	        while(itr.hasNext()) {
	           Entry m1=(Entry) itr.next();
	        	System.out.println(m1.getKey()+":"+m1.getValue());
	        	if(m1.getKey().equals(111) ) {
	        		m1.setValue("New Test");
	        	}
	        }
	        System.out.println(hm);
	}
}
