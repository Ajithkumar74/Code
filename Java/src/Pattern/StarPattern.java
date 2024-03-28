package Pattern;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing required number of lines/rows
		int n=5;
		//outer loop for the line/row change
		for (int i = 1; i <= n; i++) {
			//inner loop for the star printing

			for (int j = 1; j <= i; j++) {
				//Printing the star without changing the line
				System.out.print("*");
			}
			//Line/Row change
			System.out.println();
		}

	}

}
