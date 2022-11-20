package String;

public class febonacci_Series {
	public static void main(String[] args) {

		int a = 5;
		int b = 1;
		int c;
		int count = 10;
		System.out.println(a + " " + b);
		for (int i = 2; i < count; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}
}
