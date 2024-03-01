package MapsInJava;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap1 {
	public static void main(String[] arg) {
		Map<String, String> hm = new HashMap<String, String>();

		hm.put("hashmap coding interview questions", "AT INTERVEWBIT");
		hm.put(null, "AT INTERVEWBIT");
		Set es = hm.entrySet();

		Iterator itr = es.iterator();

		while (itr.hasNext()) {
			Map.Entry m1 = (Entry) itr.next();
			System.out.println(m1.getKey() + ":" + m1.getValue());
		}
	}
}