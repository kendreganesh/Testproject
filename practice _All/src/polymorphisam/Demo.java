package polymorphisam;

public class Demo {
	static public void addition(int a,int b) {//static method overloading
		System.out.println(a+b);
		
	}
	static public void addition (int a,int b,int c) {
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args) {
		Demo.addition(10, 20);
		Demo.addition(60, 70, 80);
	}

}
