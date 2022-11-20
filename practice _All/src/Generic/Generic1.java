package Generic;

public class Generic1 <T> {
	int a;
	T b;
	public static void main(String[] args) {
		
		Generic1 x = new Generic1();
		x.a=34;
		System.out.println(x.a);
		
		x.b="pune is the best city";
		x.b=567;
		System.out.println(x.b);
		
		x.b=78.59f;
		System.out.println(x.b);
		
	}
	

}
