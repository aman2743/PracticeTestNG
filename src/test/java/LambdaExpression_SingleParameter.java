
interface LambdaInterface1 {
	public void display(int a);
}

public class LambdaExpression_SingleParameter {
	public static void main(String[] args) {
		LambdaInterface1 obj = (a) -> {
			System.out.println("inside display with Single Parameter");
		};
		obj.display(10);
	}
}
