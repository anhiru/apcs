import java.util.Scanner;

public class WeeklySchedule {
	private Scanner in;
	private String[] days;
	private int[] hours;
	private double wage;

	public WeeklySchedule() {
		in = new Scanner(System.in);
		days = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		hours = new int[7];
		wage = 0;
	}
	public void fillSchedule() {
		System.out.println("Enter your schedule (in hours worked each day).");
		for(int i = 0; i < days.length; i++) {
			System.out.printf("%s: ", days[i]);
			hours[i] = in.nextInt();
		}
	}
	public int[] getHours() {
		return hours;
	}
	public void setWage() {
		System.out.print("How much do you get paid per day? $");
		wage = in.nextDouble();
	}
	public double getWage() {
		return wage;
	}
	public void viewSchedule() {
		int daysPerLine = 5;
		for(int k = 0; k < days.length; k = k + daysPerLine) { 
			for(int i = k; i < k + daysPerLine && i < days.length; i++) {
				System.out.printf("%-10s%-5s", days[i] + ":", " ");
			}
			System.out.printf("%n");

			for(int i = k; i < k + daysPerLine && i < days.length; i++) {
				System.out.printf("%d hr%-11s", hours[i], " ");
			}
			System.out.printf("%n%n");
		}
	}
}