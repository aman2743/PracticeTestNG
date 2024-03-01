package pkg1;

@FunctionalInterface
interface I1 {
	public void M11(int a, int b);
}


public class MainClass {

	public static void main(String[] args) {
     I1 obj=(x,y)->{
    	    int z=x+y;
    	    System.out.println(z);
     };
     obj.M11(10,20);
	}

}
