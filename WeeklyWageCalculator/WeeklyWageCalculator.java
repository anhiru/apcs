import java.util.Scanner;

public class WeeklyWageCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] hours = new int[7];
		System.out.print("How much do you get paid per day? $");
		double wage = in.nextDouble();
		System.out.println("Enter your schedule (in hours worked each day).");
		System.out.print("Monday: ");
		hours[1] = in.nextInt();
		System.out.print("Tuesday: ");
		hours[2] = in.nextInt();
		System.out.print("Wednesday: ");
		hours[3] = in.nextInt();
		System.out.print("Thursday: ");
		hours[4] = in.nextInt();
		System.out.print("Friday: ");
		hours[5] = in.nextInt();
		System.out.print("Saturday: ");
		hours[6] = in.nextInt();
		System.out.print("Sunday: ");
		hours[0] = in.nextInt();
		WeeklyWage w = new WeeklyWage(hours, wage);
		boolean calc = true;

		while(calc) {
			System.out.println();
			System.out.println("[1] Weekly Pay");
			System.out.println("[2] Raise");
			System.out.println("[3] Pay Cut");
			System.out.println("[4] Total Hours");
			System.out.println("[5] Overtime Hours");
			System.out.println("[6] QUIT");
			int input = in.nextInt();
			System.out.println();
			switch(input) {
				case 1:
					System.out.println("Paycheck: $" + w.getWeeklyPay());
					break;
				case 2:
					System.out.print("Percent raise: ");
					w.raise(in.nextDouble());
					System.out.printf("New weekly wage: $%.2f%n", w.getWage());
					break;
				case 3:
					System.out.print("Percent cut: ");
					w.cut(in.nextDouble());
					System.out.printf("New weekly wage: $%.2f%n", w.getWage());
					break;
				case 4:
					System.out.println("Total number of hours worked this week: " + w.getTotalHours());
					break;
				case 5:
					System.out.println("Hours worked overtime this week: " + w.getTotalOvertimeHours());
					break;
				case 6:
					calc = false;
					break;
				default:
					System.out.printf("Invalid option. Try again.%n%n");
					continue;
			}
		}
	}
}