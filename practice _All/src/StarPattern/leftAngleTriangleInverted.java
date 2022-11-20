package StarPattern;

public class leftAngleTriangleInverted {

	public static void main(String[] args) {

		int star = 5;
		int space = 0;

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
			space--;
		}

	}

}
