package com.itcaree4u.groupTests;
import org.testng.annotations.Test;


public class GroupTest2 {
	@Test(groups = "smoke")
	public void Test4() {
		System.out.println("GroupTest2/Test4");
	}
	@Test(groups = {"regression","smoke","windows.regression"})
	public void Test5() {
		System.out.println("GroupTest2/Test5");

	}
	@Test(groups = {"sanity"})
	public void Test6() {
		System.out.println("GroupTest2/Test6");
	}
	
	@Test(groups = {"sanity"})
	public void Test7() {
		System.out.println("GroupTest2/Test7");
	}
}
