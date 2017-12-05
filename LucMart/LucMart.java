/**
 * @author (Andrew) 
 * @version (11/06/2017)
 */
import java.util.Scanner;

public class LucMart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Store lucy = new Store();
        String name, sku; 
        double price; 
        int count;
        boolean shop = true;
        System.out.println("Welcome to LucMart, where Luc is always right.");

        while(shop) {
            System.out.println("[1] Add an item.");
            System.out.println("[2] Sell an item.");
            System.out.println("[3] Find an item.");
            System.out.println("[4] Adjust prices.");
            System.out.println("[5] Set price limit.");
            System.out.println("[6] Determine the item(s) most in stock.");
            System.out.println("[7] View inventory.");
            System.out.println("[8] EXIT");
            int input = in.nextInt();
            System.out.println();
            switch(input) {
                case 1:
                    System.out.print("Enter item name: ");
                    name = in.next();
                    System.out.print("Enter price: $");
                    price = in.nextDouble();
                    System.out.print("Enter SKU: ");
                    sku = in.next();
                    Item i = new Item(name, price, sku);
                    lucy.addItem(i);
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    name = in.next();
                    System.out.print("How many items? ");
                    count = in.nextInt();
                    lucy.sell(name, count);
                    break;
                case 3:
                    System.out.print("Enter item name: ");
                    name = in.next();
                    System.out.println(); //////
                    break;
                case 4:
                    System.out.print("Enter item name: ");
                    name = in.next();
                    System.out.print("What is the adjusted price? $");
                    price = in.nextDouble();
                    lucy.setDiscountPrice(name, price);
                    break;
                case 5:
                    System.out.print("What is the price limit? $");
                    price = in.nextDouble();
                    lucy.displayCheapItems(price);
                    break;
                case 6:
                    lucy.getSurplusItem();
                    break;
                case 7:
                    lucy.printInventory();
                    break;
                case 8:
                    System.out.println("Thanks for stopping by!");
                    shop = false;
                    break;
                default:
                    System.out.printf("Invalid option. Try again.%n%n");
                    continue;
            }
            System.out.println();
        }
    }
}