import java.util.Scanner;

public class Matrix {
	public static String align(double[][] arr) {
		String box = "";
		for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr[0].length; j++) {
     		   if(String.valueOf(Math.round(arr[i][j]*1000.0)/1000.0).length() > box.length()) {
      			    box = String.valueOf(Math.round(arr[i][j]*1000.0)/1000.0);
        		}
   			}
   		}
   		for(int i = 0; i < arr.length; i++) {
       		for(int j = 0; j < arr[0].length; j++) {
            	String gap = " ";   
            	for(int k = 0; k < Math.abs(box.length()-String.valueOf(Math.round(arr[i][j]*1000.0)/1000.0).length()); k++) {
              		gap += " ";  
           		}	
	   			System.out.print(Math.round(arr[i][j]*1000.0)/1000.0 + gap);
    		}
    		System.out.println("");
		}
		return "";
	}
	public static void main(String[] args) {
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("1) Scalar Multiplication");
			System.out.println("2) Determinant");
			System.out.println("3) Matrix Addition");
			System.out.println("4) Matrix Subtraction");
			System.out.println("5) Matrix Multiplication");
			System.out.println("6) Reduced Row Echelon Form");
			System.out.println("7) Inverse");
			System.out.print("Please choose one: ");
			int choice = in.nextInt();
			switch(choice) {
				case 1: //Scalar Multiplication
				System.out.print("Enter matrix dimensions: ");
				int row = in.nextInt();
				int column = in.nextInt();
				double[][] arr = new double[row][column];
				for(int i = 0; i < row; i++) {
					System.out.print("Enter " + column + " values for row " + (i + 1) + ": ");
					for(int j = 0; j < column; j++) {
						arr[i][j] = in.nextDouble();
					}
				}
				System.out.println("");
				System.out.println("YOUR MATRIX: ");
				System.out.println(align(arr));	
				System.out.print("Enter the scalar mutliple: ");
				double scalar = in.nextDouble();
				for(int i = 0; i < row; i++) {
					for(int j = 0; j < column; j++) {
						arr[i][j] = scalar*arr[i][j];
					}
				}
				System.out.println("");
				System.out.println("RESULT: ");
				System.out.print(align(arr));
				break;

				case 2: //Determinant
				while(true) {
					in.nextLine();
					System.out.println("Choose your matrix dimensions: 2x2 or 3x3");
					String answer = in.nextLine().replaceAll("\\s+","").toLowerCase();
					if(answer.equals("2x2") || answer.equals("22") || answer.equals("2")) { //User chooses 2x2
						arr = new double[2][2];
						for(int i = 0; i < 2; i++) {
							System.out.print("Enter 2 values for row " + (i + 1) + ": ");
							for(int j = 0; j < 2; j++) {
								arr[i][j] = in.nextDouble();
							}
						}
						System.out.println(""); //Print the matrix for the user to visualize
						System.out.println("YOUR MATRIX: ");
						System.out.print(align(arr));
						//Actually find the 2x2 determinant
						double det = Math.round((arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0])*1000.0)/1000.0;
						System.out.println("The determinant is " + det + ".");
						break;
					} else if(answer.equals("3x3") || answer.equals("33") || answer.equals("3")) { //User chooses 3x3
						arr = new double[3][3];
						for(int i = 0; i < 3; i++) {
							System.out.print("Enter 3 values for row " + (i + 1) + ": ");
							for(int j = 0; j < 3; j++) {
								arr[i][j] = in.nextDouble();
							}
						}
						System.out.println(" "); //Print the matrix for the user to visualize
						System.out.println("YOUR MATRIX: ");
						System.out.print(align(arr)); 
						//Actually find the 3x3 determinant
						double eifh = arr[1][1]*arr[2][2]-arr[1][2]*arr[2][1];
						double difg = arr[1][0]*arr[2][2]-arr[1][2]*arr[2][0];
						double dheg = arr[1][0]*arr[2][1]-arr[1][1]*arr[2][0];
						double det = Math.round((arr[0][0]*eifh - arr[0][1]*difg + arr[0][2]*dheg)*1000.0)/1000.0;
						System.out.println("The determinant is " + det + ".");
						break;
					} else {
						System.out.println("Please use one of the dimensions given.");
					}
				}
				break;

				case 3: //Matrix Addition
        		System.out.print("Enter dimensions of matrix 1: ");
        		int row1 = in.nextInt();
        		int column1 = in.nextInt();
        		arr = new double[row1][column1];
        		System.out.print("Enter dimensions of matrix 2: ");
        		int row2 = in.nextInt();
        		int column2 = in.nextInt();
        		double[][] matrix = new double[row2][column2];

        		System.out.println("");
        		if(row1 != row2 || column1 != column2) {
            		System.out.println("Addition is not possible.");
            	} else {
            		for(int i = 0; i < row1; i++) {
                		System.out.print("Enter " + column1 + " values for row " + (i + 1) + " of matrix 1: ");
                		for(int j = 0; j < column1; j++) {
                    		arr[i][j] = in.nextDouble();
                		}
            		}
            		for(int i = 0; i < row2; i++) {
                		System.out.print("Enter " + column2 + " values for row " + (i + 1) + " of matrix 2: ");
                		for(int j = 0; j < column2; j++) {   
                    		matrix[i][j]=in.nextDouble();
                		}
            		}
            		for(int i = 0; i < row1; i++) {
                		for(int j = 0; j < column1; j++) {
                    		arr[i][j] += matrix[i][j];    
                		}
            		}
            		System.out.println("");
        			System.out.println("RESULT: ");
        			System.out.print(align(arr));
        		}
				break;

				case 4: //Matrix Subtraction
				System.out.print("Enter dimensions of matrix 1: ");
        		row1 = in.nextInt();
        		column1 = in.nextInt();
        		arr = new double[row1][column1];
        		System.out.print("Enter dimensions of matrix 2: ");
        		row2 = in.nextInt();
        		column2 = in.nextInt();
        		matrix = new double[row2][column2];

        		System.out.println("");
        		if(row1 != row2 || column1 != column2) {
            		System.out.println("Subtraction is not possible.");
            	} else {
            		for(int i = 0; i < row1; i++) {
                		System.out.print("Enter " + column1 + " values for row " + (i + 1) + " of matrix 1: ");
                		for(int j = 0; j < column1; j++) {
                    		arr[i][j] = in.nextDouble();
                		}
            		}
            		for(int i = 0; i < row2; i++) {
                		System.out.print("Enter " + column2 + " values for row " + (i + 1) + " of matrix 2: ");
                		for(int j = 0; j < column2; j++) {   
                    		matrix[i][j]=in.nextDouble();
                		}
            		}
            		for(int i = 0; i < row1; i++) {
                		for(int j = 0; j < column1; j++) {
                    		arr[i][j] -= matrix[i][j];    
                		}
            		}
        			System.out.println("RESULT: ");
        			System.out.print(align(arr));
        		}
				break;

				case 5: //Matrix Multiplication
        		System.out.print("Enter dimensions of matrix 1: ");
        	 	row1 = in.nextInt();
        		column1 = in.nextInt();
        		double[][] matrix1 = new double[row1][column1];
        		System.out.print("Enter dimensions of matrix 2: ");
        		row2 = in.nextInt();
        		column2 = in.nextInt();
        		double[][] matrix2 = new double[row2][column2];
        		arr = new double[row1][column2];
        		int sum = 0;

        		System.out.println("");
        		if(row1 != column2 || column1 != row2) {
            		System.out.println("Multiplication is not possible.");
        		} else {
            		for(int i = 0; i < row1; i++) {
                		System.out.print("Enter " + column1 + " values for row " + (i + 1) + " of matrix 1: ");
                		for(int j = 0; j < column1; j++) {
                    		matrix1[i][j] = in.nextDouble();
                		}
            		}
            		for(int i = 0; i < row2; i++) {
                		System.out.print("Enter " + column1 + " values for row " + (i + 1) + " of matrix 2: ");
                		for(int j = 0; j < column2; j++) {   
                    		matrix2[i][j] = in.nextDouble();
                    	}
                	}
            		for(int i = 0; i < row1; i++) {
                		for(int j = 0; j < column2; j++) {
                    		sum = 0;
                    		for( int k = 0; k < column1; k++) {
                        		sum += matrix1[i][k]*matrix2[k][j];
                        	}
                    		arr[i][j] = sum;
                		}
            		}
            		System.out.println("");
            		System.out.println("RESULT: ");
        			System.out.print(align(arr));
            	}
				break;

				case 6: //Reduced Row Echelon Form
				System.out.print("Enter the number of rows: ");
				row = in.nextInt();
				column = row + 1;
				arr = new double[row][column];
				for(int i = 0; i < row; i++) {
					System.out.print("Enter " + column + " values for row " + (i + 1) + ": ");
					for(int j = 0; j < column; j++) {
						arr[i][j] = in.nextDouble();
					}
				}
				System.out.println("");

				//Print the original matrix for the user to visualize
				System.out.println("YOUR MATRIX: ");
				System.out.println(align(arr));

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
					sum = 0;
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
				System.out.println("REDUCED ROW ECHELON FORM: ");
				System.out.print(align(arr));
				break;

				case 7: //Inverse
				System.out.print("Enter the number of rows: ");
				row = in.nextInt();
				column = row * 2;
				boolean check = false;
				matrix = new double[row][column];
				for(int i = 0; i < row; i++) {
	    			System.out.print("Enter " + column/2 + " values for row " + (i + 1) + ": ");
	    			for(int j = 0; j < column/2; j++) {
						matrix[i][j] = in.nextDouble();
	    			}
        		}
        		System.out.println("");
        		
        		//Sets right half of matrix to identity matrix
        		for(int j = column/2; j < column; j++) {
            		matrix[j-column/2][j] = 1;
        		}

				//Print the original matrix for the user to visualize
				arr = new double[row][column/2];
				for(int i = 0; i < row; i++) {
					for(int j = 0; j < column/2; j++) {
						arr[i][j] = matrix[i][j];
					}
				}
				System.out.println("YOUR MATRIX: ");
				System.out.println(align(arr));

				for(int k = 0; k < row; k++) {
	    			//Makes values on the diagonal = 1
	    			double temp = matrix[k][k];
	    			for(int j = 0; j < column; j++) {
						matrix[k][j] /= temp;
	    			}
					//Makes values below the diagonal = 0 
	    			for(int i = k + 1; i < row; i++) {
						double coefficient = matrix[i][k];
						for(int j = 0; j < column; j++) { 
		    				matrix[i][j] = matrix[k][j]*coefficient - matrix[i][j];
						}
	    			}
				}

				//Makes values above the diagonal = 0
				for(int k = row - 1; k >= 0; k--) {
	    			for(int i = k - 1; i >= 0; i--) {
	        			double coefficient = matrix[i][k];
						for(int j = column - 1; j >= 0; j--) { 
		    				matrix[i][j] -= matrix[k][j]*coefficient;
						}
	    			}
				}

				//FINAL PRINT
				System.out.println("INVERSE MATRIX: ");
				for(int k = 0; k < column/2; k++) {
	    			if(matrix[k][k] != 1) {
	        			check = true;
	      		 	}
	   			}
	   			if(check == true) {
	   	  		   	System.out.println("Does not exist.");
	    		} else {
	    			for(int i = 0; i < row; i++) {
						for(int j = column/2; j < column; j++) {
							arr[i][j-column/2] = matrix[i][j];
						}
					}
	    			System.out.print(align(arr));
				}
				break;
			}
			System.out.println("");
            System.out.print("Continue? (Y/N) ");
            String answer = in.next().toLowerCase();
            if(answer.startsWith("n")) {
                break;
            } 
		}
	}
}