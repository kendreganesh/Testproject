package StarPattern;


public class RightAngleTriangleinverted {
	
	public static void main(String[] args) {
		
		int star =5;
		int space =1;
		
		for (int i=0; i<=5; i++) {
			
			for (int j=0;j<=space ;j++) {
			System.out.print(" ");	
			}
			for (int k=0 ; k<=star; k++) {
				System.out.print("*");
			}
			System.out.println();
			star --;
			space ++;
			
		}
	}

}
