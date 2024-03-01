package pkg1;

interface T1 {
	public void M21();

	public void M22();
}

public class AnnonymousClassInJava {

	public static void main(String[] args) {
		T1 obj = new T1() {

			@Override
			public void M21() {
				System.out.println("Inside M21");
			}
			@Override
			public void M22() {
				System.out.println("Inside M22");
			}
		};
		obj.M21();
		obj.M22();
	}
}
