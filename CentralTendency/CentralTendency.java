import java.util.Scanner;

public class CentralTendency {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("How many numbers are in your data set? "); //Determine the number of values in the data set
			int total = in.nextInt();
			if(total > 0) {
				double[] nums = new double[total]; //Create new array with length == # of values in the data set
				System.out.println("Enter " + total + " numbers below. ");
				for(int i = 0; i < total; i++) {
					nums[i] = in.nextDouble();
				}	
				MeanMedianMode data = new MeanMedianMode(nums);
				data.print();
				data.sort();

				boolean compute = true;
				while(compute) {
					System.out.println();
					System.out.println("[1] Mean");
					System.out.println("[2] Median");
					System.out.println("[3] Mode");
					System.out.println("[4] Standard Deviation");
					System.out.println("[5] Midrange");
					System.out.println("[6] Range");
					System.out.println("[7] Maximum");
					System.out.println("[8] Minimum");
					System.out.println("[9] Random #");
					System.out.println("[0] Quit");
					int input = in.nextInt();
					System.out.println();
					switch(input) {
						case 1:
							System.out.printf("Mean: %.3f%n", data.mean());
							break;
						case 2:
							data.median();
							break;
						case 3:
							data.mode();
							break;
						case 4:
							data.standardDeviation();
							break;
						case 5:
							data.midRange();
							break;
						case 6:
							data.range();
							break;
						case 7:
							data.maximum();
							break;
						case 8:
							data.minimum();
							break;
						case 9:
							data.randomNum();
							break;
						case 0:
							compute = false;
							break;
						default:
							System.out.println("Invalid option. Try again.");
							continue;
					}
				}
				break;
			} else {
				System.out.printf("Data set needs to be larger.%n%n");
			}
		}
	}
}
