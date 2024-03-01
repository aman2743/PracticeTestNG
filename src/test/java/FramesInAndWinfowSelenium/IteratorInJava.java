package FramesInAndWinfowSelenium;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInJava {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Aman");
		al.add("test");
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}		
