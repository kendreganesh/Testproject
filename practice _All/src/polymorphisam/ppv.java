package polymorphisam;

public class ppv {

	private int a;
	private int b;

	  ppv() {
		a = 34;
		b = 56;
	}

	ppv(int c, int d) {
		a = 89;
		b = 54;

	}

	public void test() {
		int c = a + b;
		System.out.println(c);

	}
}
