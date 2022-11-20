package Method_constructor;

public class GlobalLocal {
	int a= 78;
	public void Demo () {
		int b= 89;
		int a=12;
		System.out.println(a);
		System.out.println(b);
	}
	public void Demo1 () {
		int c=56;
		int b= 45;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		GlobalLocal  x= new GlobalLocal ();
		System.out.println(x.a);
		x.Demo();
		x.Demo1();
	}

}
