import java.util.Scanner;

public class WeeklyWageCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		WeeklySchedule schedule = new WeeklySchedule();
		schedule.setWage();
		schedule.fillSchedule();
		
		WeeklyWage w = new WeeklyWage(schedule.getHours(), schedule.getWage());
		boolean calc = true;

		while(calc) {
			System.out.println();
			System.out.println("[1] Weekly Pay");
			System.out.println("[2] Raise");
			System.out.println("[3] Pay Cut");
			System.out.println("[4] Total Hours");
			System.out.println("[5] Overtime Hours");
			System.out.println("[6] Undertime Hours");
			System.out.println("[7] View Schedule");
			System.out.println("[8] QUIT");
			int input = in.nextInt();
			System.out.println();
			switch(input) {
				case 1:
					System.out.printf("Paycheck: $%.2f%n", w.getWeeklyPay());
					break;
				case 2:
					System.out.print("Percent raise: ");
					w.raise(in.nextDouble());
					System.out.printf("New wage: $%.2f%n", w.getWage());
					break;
				case 3:
					System.out.print("Percent cut: ");
					w.cut(in.nextDouble());
					System.out.printf("New wage: $%.2f%n", w.getWage());
					break;
				case 4:
					System.out.printf("Total number of hours worked this week: %d%n", w.getTotalHours());
					break;
				case 5:
					System.out.printf("Hours worked overtime this week: %d%n", w.getTotalOvertimeHours());
					break;
				case 6:
					System.out.printf("Hours worked undertime this week: %d%n", w.getTotalUndertimeHours());
					break;
				case 7:
					schedule.viewSchedule();
					break;
				case 8:
					calc = false;
					break;
				default:
					System.out.printf("Invalid option. Try again.%n%n");
					continue;
			}
		}
	}
}
