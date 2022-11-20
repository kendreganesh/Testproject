package Generic;

public class Generic2 <T,D> {
	int a;
	T b;
	T demo (D s) {
		System.out.println(s);
		return b;
		
	}
	public static void main(String[] args) {
		Generic2 <Integer,String> x = new Generic2<Integer,String> ();
		
	  
		x.a= 35;
		System.out.println(x.a);
		
		x.b= 567;
		System.out.println(x.b);
		 Integer y = x.demo("java");
		 
		 System.out.println(y);
  	}
}
	

