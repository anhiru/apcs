import java.util.Scanner;

public class Mode {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you want to test? "); //Determine the number of values in the data set
		int total = Math.abs(in.nextInt());
		int[] nums = new int[total]; //Create new array with length == # of values in the data set
		System.out.println("Enter " + total + " numbers below. ");
		for(int i = 0; i < total; i++) {
			nums[i] = in.nextInt();
		}
		System.out.print("Your data set: "); //Print the data set for the user to visualize
		for(int i = 0; i < total; i++) {
			System.out.print(nums[i] + " ");
		}
		int count = 0;
		for(int i = 0; i < total; i++) { //Find the number of most repetitions
			int temp = 0;
			for(int j = 0; j < total; j++) {
				if(nums[j] == nums[i]) {
					temp++;
				}
			}
			if(temp > count) {
				count = temp;
			}
		}	
		System.out.println(""); //If all numbers are unique, then there is no mode
		if(count == 1) {
			System.out.println("There is no mode in this data set.");
		} else {
			System.out.print("Mode: "); //Determine the values that have the most repetitions
			for(int i = 0; i < total; i++) {
				int temp = 0;
				for(int j = i; j < total; j++) {
					if(nums[j] == nums[i]) {
						temp++;
					}
				}
			 	if(count == temp) {
					System.out.print(nums[i] + " ");
				}
			}
		}
	}
}