package oops_interface;

public class Base2 extends Base1 {
	
		
		public   void   whatsapp() {
			System.out.println("whatsapp runing");
			
			
		}
		public void insta() {
			System.out.println("insta is running");
		}
		public void Twitter() {
			System.out.println("Twitter is running");
			
		}
		
		public static void main(String[] args) {
			Base2 b = new Base2 ();
			b.facebook();
			b.insta();
			b.Twitter();
			b.whatsapp();
		}
	}


