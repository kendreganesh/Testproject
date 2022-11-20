package polymorphisam;

public class NonStatic_method {
	public void addition (int a,int b) {
		System.out.println(a+b);
	}
	public void addition (int a, int b,int c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		NonStatic_method n = new  NonStatic_method();
		n.addition(10, 20);
		n.addition(60, 70, 80);
	}
	

}
