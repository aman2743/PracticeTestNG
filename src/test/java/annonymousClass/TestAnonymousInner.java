package annonymousClass;

interface DemoAnno {
	public void m1();

	public void m2();
}

class TestAnonymousInner {
	public static void main(String args[]) {
	    DemoAnno obj=new DemoAnno() {
			@Override
			public void m1() {
				System.out.println("inside m1");
			}

			@Override
			public void m2() {
			System.out.println("inside m2");
			}
		};
		obj.m1();
		obj.m2();
	}
}