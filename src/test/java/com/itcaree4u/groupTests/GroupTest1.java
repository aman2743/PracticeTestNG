package com.itcaree4u.groupTests;

import org.testng.annotations.Test;

//@Test (groups="All")
public class GroupTest1 {
	@Test(groups = {"smoke","sanity","windows.sanity","ios.sanity"})
	public void Test1() {
		System.out.println("GroupTest1/Test1");
	}
	
	@Test(groups = {"functional","smoke","windows.functional"})
	public void Test2() {
		System.out.println("GroupTest1/Test2");
	}
	
	@Test(groups = {"regression","ios.functional"})
	public void Test3() {
		System.out.println("GroupTest1/Test3");
	}
}
