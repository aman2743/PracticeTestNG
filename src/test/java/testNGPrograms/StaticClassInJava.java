package testNGPrograms;

public class StaticClassInJava{
	private static String str= "Edureka";
	//Static class
	public static class MyNestedClass{
		//non-static method
		public void disp(){
			System.out.println(str);
		}
	}
	public static void main(String args[]){
		StaticClassInJava.MyNestedClass obj = new StaticClassInJava.MyNestedClass();
		obj.disp();
	}
}