package com.itcaree4u.IgnoreTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoTest1 {
	@Test
	public void Test11() {
		System.out.println("Test11");
	}
	@Ignore
	@Test
	public void Test12() {
		System.out.println("Test12");
	}
	@Test
	public void Test13() {
		System.out.println("Test13");
	}
}
