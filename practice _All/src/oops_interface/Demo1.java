package oops_interface;

public class Demo1 implements  Demo {
	
	public void Test() {
		int a=90;
		int b=78;
		int c=45;
		int d= a+b+c;
		System.out.println(d);
	}
 public void Test2() {
	 System.out.println("Test2 method is runing");
	 
 }
 public static void main(String[] args) {
	Demo1 d = new Demo1 ();
	d.Test();
	d.Test2();
}
}
