import java.util.Scanner;

public class Determinant {
	public static double determinant22(double[][] arr) {
		return arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0];
	}
	public static void main(String[] args) {
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Choose your matrix dimensions: 2x2 or 3x3");
			String choice = in.nextLine().replaceAll("\\s+","").toLowerCase();
			if(choice.equals("2x2") || choice.equals("22") || choice.equals("2")) { //User chooses 2x2
				double[][] arr = new double[2][2];
				for(int i = 0; i < 2; i++) {
					System.out.print("Enter 2 values for row " + (i + 1) + ": ");
					for(int j = 0; j < 2; j++) {
						arr[i][j] = in.nextDouble();
					}
				}
				System.out.println(""); //Print the matrix for the user to visualize
				System.out.println("YOUR MATRIX: ");
				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println("");
				} //Actually find the 2x2 determinant
				System.out.println("The determinant is " + determinant22(arr) + ".");
				break;
			} else if(choice.equals("3x3") || choice.equals("33") || choice.equals("3")) { //User chooses 3x3
				double[][] arr = new double[3][3];
				for(int i = 0; i < 3; i++) {
					System.out.print("Enter 3 values for row " + (i + 1) + ": ");
					for(int j = 0; j < 3; j++) {
						arr[i][j] = in.nextDouble();
					}
				}
				System.out.println(" "); //Print the matrix for the user to visualize
				System.out.println("YOUR MATRIX: ");
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println("");
				} //Actually find the 3x3 determinant
				double eifh = arr[1][1]*arr[2][2]-arr[1][2]*arr[2][1];
				double difg = arr[1][0]*arr[2][2]-arr[1][2]*arr[2][0];
				double dheg = arr[1][0]*arr[2][1]-arr[1][1]*arr[2][0];
				System.out.println("The determinant is " + (arr[0][0]*eifh - arr[0][1]*difg + arr[0][2]*dheg) + ".");
				break;
			} else {
				System.out.println("Please use one of the dimensions given.");
				continue;
			}
		}
	}
}