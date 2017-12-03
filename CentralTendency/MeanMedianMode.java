import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class MeanMedianMode {
	private double[] data;
	private int len;

	public MeanMedianMode(double[] nums) {
		data = nums;
		len = data.length;
	}
	public void print() {
		System.out.println();
		System.out.print("Your data set: "); //Print the data set for the user to visualize
		for(int i = 0; i < len; i++) {
			System.out.print(data[i] + "  ");
		}
	}
	public double mean() {
		double temp = 0;
		for(int i = 0; i < len; i++) {
			temp += data[i];
		}
		return temp/len;
	}
	public void median() {
		Arrays.sort(data);
		System.out.println();
		System.out.print("Median: ");
		if(len % 2 == 0) {
			System.out.printf("%.3f%n", (data[len/2-1]+data[len/2])/2);
		} else {
			System.out.println(data[len/2]);
		}
	}
	public void mode() {
		int count = 0;
		for(int i = 0; i < len; i++) { //Find the number of most repetitions
			int temp = 0;
			for(int j = 0; j < len; j++) {
				if(data[j] == data[i]) {
					temp++;
				}
			}
			if(temp > count) {
				count = temp;
			}
		}	
		System.out.println(); //If all numbers are unique, then there is no mode
		if(count == 1) {
			System.out.println("There is no mode in this data set.");
		} else {
			System.out.print("Mode: "); //Determine the values that have the most repetitions
			for(int i = 0; i < len; i++) {
				int temp = 0;
				for(int j = i; j < len; j++) {
					if(data[j] == data[i]) {
						temp++;
					}
				}
			 	if(count == temp) {
					System.out.print(data[i] + "  ");
				}
			}
			System.out.println();
		}
	}
	public void standardDeviation() {
		double temp = 0;
		for(int i = 0; i < len; i++) {
			temp += Math.pow(i-mean(), 2);
		}
		System.out.printf("%nStandard deviation: %.3f%n", Math.pow(temp/len, 0.5));
	}
	public void midRange() {
		Arrays.sort(data);
		System.out.println();
		System.out.println("Midrange: " + (data[len-1]+data[0])/2);
	}
	public void range() {
		Arrays.sort(data);
		System.out.println();
		System.out.println("Range: " + (data[len-1]-data[0]));
	}
	public void maximum() {
		Arrays.sort(data);
		System.out.println();
		System.out.println("Maxmimum: " + data[len-1]);
	}
	public void minimum() {
		Arrays.sort(data);
		System.out.println();
		System.out.println("Minimum: " + data[0]);
	}
	public void randomNum() {
		ArrayList<Double> temp = new ArrayList<Double>();
		for(int i = 0; i < len; i++) {
			temp.add(data[i]);
		}
		Collections.shuffle(temp);
		System.out.println();
		System.out.println("Random #: " + temp.get(0));
	}
}