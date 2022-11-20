package oops_interface;

public class B implements Test{
	public void mart () {
		System.out.println("All shops open");
	}
	
public void Dmart() {
	System.out.println("Shopping");
}
public static void main(String[] args) {
	
	A x = new A();
	B y = new B();
	x.Dmart();
	x.mart();
	y.Dmart();
	y.mart();
}
}
