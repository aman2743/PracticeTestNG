
interface LambdaInterface2 {
	public void display(int a,int b);
}

public class LambdaExpression_DoubleParameter {
	public static void main(String[] args) {
		LambdaInterface2 obj = (x,y) -> {
			int z=x+y;
			System.out.println(z);
			System.out.println("inside display with double Parameter");
		};
		obj.display(10,20);
	}
}
