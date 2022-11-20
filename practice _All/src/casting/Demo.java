package casting;

public class Demo {
	public static void main(String[] args) {

		System.out.println("************super class object*************");
		Casting x = new Casting();
		x.Demo();
		x.set();
		x.staticCasting();

		System.out.println("***************sub class object****************");
		Casting1 y = new Casting1();
		y.Demo();
		y.set();
		y.sub();
		y.staticcasting();

		System.out.println("***********up casting*************");
		Casting z = new Casting1();
		z.Demo();
        z.set();
        z.staticCasting();
        
        Casting sub =(Casting1) new Casting();
        sub.Demo();
        sub.set();
	}

}
