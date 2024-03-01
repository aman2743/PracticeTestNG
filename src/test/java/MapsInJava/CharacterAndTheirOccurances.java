package MapsInJava;

import java.util.HashMap;

public class CharacterAndTheirOccurances {

		public static void main(String[] args) {
			String str = "AMAN";
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			int len = str.length();
			int count;
			for (int i = 0; i < len; i++) {
				char c = str.charAt(i);
				if (hm.containsKey(c)) {
					count = hm.get(c);
					count++;
					hm.replace(c, count);
				} else {
					hm.put(c, 1);
				}
			}
	      for(Character key:hm.keySet()) {
	    	  System.out.println(key+":"+hm.get(key));
	      }
		}
	}

