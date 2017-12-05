/**
 * @author (Andrew) 
 * @version (10/17/2017)
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Boss {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	ArrayList<Employee> staff = new ArrayList<Employee>();
    	System.out.println("You are the boss of Dunder Mifflin Paper Company, Inc.");
    	System.out.println("Everyone receives a starting salary of $50,000.");
    	System.out.printf("Let's get started. Hire someone!%n%n");
    	System.out.println("Who will be your first employee?");
    	String name = in.nextLine();
        Employee e = new Employee(name, 50000);
        staff.add(e);
        double amount;
        boolean exist = false;
        boolean business = true;

        while(business) {
        	System.out.println();
	        System.out.println("[1] Hire");
	        System.out.println("[2] Raise Salary");
	        System.out.println("[3] Pay Cut");
	        System.out.println("[4] Fire");
	        System.out.println("[5] Display Staff Members");
	        System.out.println("[6] SHUT DOWN");
	        int input = in.nextInt();
	        System.out.println();
	        switch(input) {
	        	case 1:
	        		System.out.print("Who do you want on your staff? ");
	        		in.nextLine();
	        		name = in.nextLine();
	        		e = new Employee(name, 50000);
	        		staff.add(e);
	        		System.out.printf("%s has been hired.%n", name);
	        		break;
	        	case 2:
	        		System.out.print("Employee name: ");
	        		in.nextLine();
	        		name = in.nextLine();
	        		exist = false;
	        		for(int i = 0; i < staff.size(); i++) {
	        			Employee temp = staff.get(i);
	        			if(temp.getName().equals(name)) {
	        				System.out.print("Percent raise: ");
	        				amount = in.nextDouble();
	        				temp.raiseSalary(amount);
	        				System.out.printf("%s's salary has been raised %.2f%%%n", temp.getName(), amount);
	        				exist = true;
	        			}
	        		}
	        		if(!exist) {
	        			System.out.printf("%s does not exist.%n", name);
	        		}
	        		break;
	        	case 3:
	        		System.out.print("Employee name: ");
	        		in.nextLine();
	        		name = in.nextLine();
	        		exist = false;
	        		for(int i = 0; i < staff.size(); i++) {
	        			Employee temp = staff.get(i);
	        			if(temp.getName().equals(name)) {
	        				System.out.print("Percent cut: ");
	        				amount = in.nextDouble();
	        				temp.cutSalary(amount);
	        				System.out.printf("%s's salary has been cut %.2f%%%n", temp.getName(), amount);
	        				exist = true;
	        			}
	        		}
	        		if(!exist) {
	        			System.out.printf("%s does not exist.%n", name);
	        		}
	        		break;
	        	case 4:
	        		System.out.print("Who do you want off your staff? ");
	        		in.nextLine();
	        		name = in.nextLine();
	        		exist = false;
	        		for(int i = 0; i < staff.size(); i++) {
	        			if(staff.get(i).getName().equals(name)) {
	        				System.out.print("Reason: ");
	        				in.nextLine(); 
	        				System.out.printf("%s has been fired.%n", staff.get(i).getName());
	        				staff.remove(i);
	        				i--;
	        				exist = true;
	        			}
	        		}
	        		if(!exist) {
	        			System.out.printf("%s does not exist.%n", name);
	        		}
	        		break;
	        	case 5:
	        		for(int i = 0; i < staff.size(); i++) {
	        			System.out.printf("%s, $%.2f%n", staff.get(i).getName(), staff.get(i).getSalary());
	        		}
	        		break;
	        	case 6:
	        		System.out.printf("Business ended on %s.%n", getDateTime());
	        		business = false;
	        		break;
	        	default:
	        		System.out.printf("Invalid option. Try again.%n%n");
	        		continue;
		    }
    	}
    }
    public static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy @ hh:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}