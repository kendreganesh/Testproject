package StarPattern;

public class pyramid {
	public static void main(String[] args) {
		
		int space = 10;
		int star =1 ;
		
		for (int i=0; i<= 10 ; i++) {
			
			for (int j=0; j<=space ;j++) {
				System.out.print(" ");
			}
			for (int k=0; k<= star ;k++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=4) {
				star=star+2;
				space--;
			}
			else { 
				star =star-2;
				space ++;
			}
		}
	}

}
