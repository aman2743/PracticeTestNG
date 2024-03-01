package MapsInJava;

import java.util.HashMap;

public class KeySetInMap {
	public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(111,"Test");
        hm.put(112,"QA");
        hm.put(113,"Dev");
        hm.put(114,"Mgr");
//        Set<Integer> ks=hm.keySet();
//        for(Integer it:ks) {
//        	System.out.println(it);
//        }
        System.out.println(hm);
        hm.remove(111,"Test");
        System.out.println(hm);
    }
}