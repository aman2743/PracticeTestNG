
interface LambdaInterface {
	public void display();
}

public class LambdaExpression {
	public static void main(String[] args) {
		LambdaInterface obj = () -> {
			System.out.println("inside display");
		};
		obj.display();
	}
}
