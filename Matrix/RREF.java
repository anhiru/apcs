import java.util.Scanner;

public class RREF {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = in.nextInt();
		int column = row + 1;
		double[][] arr = new double[row][column];
		for(int i = 0; i < row; i++) {
			System.out.print("Enter " + column + " values for row " + (i + 1) + ": ");
			for(int j = 0; j < column; j++) {
				arr[i][j] = in.nextDouble();
			}
		}
		System.out.println("");

		//Print the original matrix for the user to visualize
		System.out.println("YOUR MATRIX: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		} 

		//Makes every value on diagonal = 1 and values below diagonal = 0
		for(int k = 0; k < row; k++) {
			double temp = arr[k][k];
			if(temp != 0) {
				for(int j = 0; j < column; j++) {
					arr[k][j] /= temp;
				} 
				for(int i = k + 1; i < row; i++) {
					double coefficient = arr[i][k];
					for(int j = 0; j < column; j++) { 
						arr[i][j] = arr[k][j]*coefficient - arr[i][j];
					} 
				} 
			} else {
				temp = arr[k][column - 1];
				for(int j = 0; j < column; j++) {
					arr[k][j] /= temp;
				} 
				for(int i = k + 1; i < row; i++) {
					double coefficient = arr[i][k];
					for(int j = 0; j < column; j++) { 
						arr[i][j] = arr[k][j]*coefficient - arr[i][j];
					} 
				} 
			} 
		}

		//If value on the diagonal = 0 instead of 1, swap that row with next one down
		for(int k = 0; k < row; k++) {
			int sum = 0;
			int countZero = 0;
			for(int j = 0; j < column - 1; j++) {
				if(arr[k][j] == 0) {
					countZero++;
				}
				sum += arr[k][j];
			}
			if(sum == 0) {
				int countZeros = 0;
				for(int i = k + 1; i < row; i++) {
					for(int j = 0; j <= i; j++) {
						if(arr[i][j] == 0) {
							countZeros++;
						}
					}
					if(countZero > countZeros) {
						for(int j = 0; j < column; j++) {
							double[] tempRow = new double[column];
							tempRow[j] = arr[k][j];
							arr[k][j] = arr[i][j];
							arr[i][j] = tempRow[j];
						}
					}
				}
			} 
		}

		//Makes values above diagonal = 0
		for(int k = row - 1; k >= 0; k--) {
			double temp = arr[k][k];
			if(temp != 0) {
				for(int i = k - 1; i >= 0; i--) {
					double coefficient = arr[i][k];
					for(int j = column - 1; j >= 0; j--) { 
						arr[i][j] -= arr[k][j]*coefficient;
					}
				}
			} else {
				for(int i = k - 1; i >= 0; i--) {
					double coefficient = arr[i][k + 1];
					for(int j = column - 1; j >= 0; j--) {
						arr[i][j] -= arr[k][j]*coefficient;
					}
				}
			}
		}

		//FINAL PRINT
		System.out.println("");
		System.out.println("REDUCED ROW ECHELON FORM: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(Math.round(arr[i][j]*1000.0)/1000.0 + " ");
			}
		System.out.println("");
		}
	}
}