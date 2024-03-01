package staticInJava;

public class StaticBlockExample {
	// static variable
	static int j = 10;
	static int n;
	 
	// static block
	static {
	System.out.println("Static block initialized.");
	n = j * 8;
	System.out.println(n);
	}
	 
	public static void main(String[] args)
	{
	System.out.println("Inside main method");
	System.out.println("Value of j : "+j);
	System.out.println("Value of n : "+n);
	}
	}