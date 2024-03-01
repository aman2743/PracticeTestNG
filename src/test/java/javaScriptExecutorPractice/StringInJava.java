package javaScriptExecutorPractice;

import java.util.HashMap;

public class StringInJava {
	public static void main(String[] args) {
		String str = "dabcabedg";
		int count;
		int len = str.length();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (hm.containsKey(c)) {
				count = hm.get(c);//get() returns value which is number here
				count++;
				hm.replace(c, count);
			} else {
				hm.put(c, 1);
			}
		}
		for(Character key:hm.keySet()) {
//			if(hm.get(key)==1) {
//			System.out.println(key+":"+hm.get(key));
//			break;
			System.out.println(key+":"+hm.get(key));
		}
//	}
	}
}
