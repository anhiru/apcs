import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = in.nextInt();
		int column = row * 2;
		boolean check = false;
		double[][] arr = new double[row][column];
		for(int i = 0; i < row; i++) {
	    	System.out.print("Enter " + column/2 + " values for row " + (i + 1) + ": ");
	    	for(int j = 0; j < column/2; j++) {
				arr[i][j] = in.nextDouble();
	    	}
        }
        System.out.println("");
        
		//Print the original matrix for the user to visualize
		System.out.println("YOUR MATRIX: ");
		for(int i = 0; i < row; i++) {
	    	for(int j = 0; j < column/2; j++) {
				System.out.print(arr[i][j] + " ");
	    	}
			System.out.println("");
		} 

		//Sets right half of matrix to identity matrix
		for(int j = column/2; j < column; j++) {
            arr[j-column/2][j] = 1;
        }

		for(int k = 0; k < row; k++) {
	    	//Makes values on the diagonal = 1
	    	double temp = arr[k][k];
	    	for(int j = 0; j < column; j++) {
				arr[k][j] /= temp;
	    	}
			//Makes values below the diagonal = 0 
	    	for(int i = k + 1; i < row; i++) {
				double coefficient = arr[i][k];
				for(int j = 0; j < column; j++) { 
		    		arr[i][j] = arr[k][j]*coefficient - arr[i][j];
				}
	    	}
		}

		//Makes values above the diagonal = 0
		for(int k = row - 1; k >= 0; k--) {
	    	for(int i = k - 1; i >= 0; i--) {
	        	double coefficient = arr[i][k];
				for(int j = column - 1; j >= 0; j--) { 
		    		arr[i][j] -= arr[k][j]*coefficient;
				}
	    	}
		}

		//FINAL PRINT
		System.out.println("");
		System.out.println("INVERSE MATRIX: ");
		for(int k = 0; k < column/2; k++) {
	    	if(arr[k][k] != 1) {
	        	check = true;
	       	}
	   	}
	    if(check == true) {
	        System.out.print("Does not exist.");
	    } else {
			for(int i = 0; i < row; i++) {
	    		for(int j = column/2; j < column; j++) {
					System.out.print(Math.round(arr[i][j]*1000.0)/1000.0 + " ");
	    		}
				System.out.println("");
			}
		}
    }
}