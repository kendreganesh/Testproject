package polymorphisam;

public class Demo2 extends Demo1 {
	public void Add () {
		System.out.println("Hello");
	}
	
public static void main(String[] args) {
	Demo2 d = new Demo2 ();
	d.Add();
	
	
	Demo1 s = new Demo1 ();
	s.Add(); 
}
}
