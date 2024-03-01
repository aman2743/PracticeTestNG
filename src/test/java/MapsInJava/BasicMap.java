package MapsInJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class BasicMap {
	public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(111,"Test");
        hm.put(112,"QA");
        hm.put(113,"Dev");
        hm.put(114,"Mgr");
//      System.out.println(hm);
//      System.out.println(hm.put(111,"Test1"));
//      System.out.println(hm);
        Set s=hm.keySet();
        System.out.println(s);
        Collection c=hm.values();
        System.out.println(c);
//      Set es=hm.entrySet();
//      System.out.println(es);
//      System.out.println(s);
//      System.out.println(c);
//      System.out.println(es);
        
     
	}
}
