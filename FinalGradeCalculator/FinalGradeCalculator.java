import java.util.Scanner;

public class FinalGradeCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("FINAL GRADE CALCULATOR");
			//1st number = current grade
			System.out.print("What is your current grade percentage? ");
			double current = in.nextDouble();
			//2nd number = grade you want in the class
			System.out.print("What percentage do you want in the class? ");
			double want = in.nextDouble();
			//3rd number = how much of your grade the final is worth
			System.out.print("What percentage is the final worth? ");
			double worth = in.nextDouble();
			//call FinalGrade class as method
			FinalGrade grade = new FinalGrade(current, want, worth);
			System.out.printf("%nYou'll need to score at least %.2f%% on the final to get a %.2f%% overall.%n", grade.least(), grade.overall());
			System.out.print("Again? (Y/N) ");
			if(in.next().toLowerCase().startsWith("n")) {
				break;
			} else {
				System.out.println();
				continue;
			}
		}
	}
}