import java.util.ArrayList;

public class Store {
	ArrayList<Item> inventory;

	public Store() {
		inventory = new ArrayList<Item>();
	}
	public void addItem(Item newItem) {
		inventory.add(newItem);
	}
	//Display all items that cost less than or equal to an inputted paramater value
	public void displayCheapItems(double cost) {
		for(int i = 0; i < inventory.size(); i++) {
			Item temp = inventory.get(i);
			if(temp.getPrice() <= cost) {
				System.out.println(temp.getName());
			}
		}
	}
	//Returns the number of items the store has with the given name or SKU
	public int getInventoryCount(String name) {
		int count = 0; 
		for(int i = 0; i < inventory.size(); i++) {
			Item temp = inventory.get(i); 
			if(temp.getName().equalsIgnoreCase(name) || temp.getSKU().equalsIgnoreCase(name)) {
				count++;
			}
		}
		return count;
	}
	public void setDiscountPrice(String name, double newPrice) {
		for(int i = 0; i < inventory.size(); i++) {
			String temp = inventory.get(i).getName();
			if(temp.equalsIgnoreCase(name)) {
				inventory.get(i).setPrice(newPrice);
			}
		}
	}
	public void getSurplusItem() {
		int count = 0;
		for(int i = 0; i < inventory.size(); i++) { 
			//Find the number of repetitions of most repeated item
			int temp = 0;
			for(int j = 0; j < inventory.size(); j++) {
				if(inventory.get(j).getName().equalsIgnoreCase(inventory.get(i).getName())) {
					temp++;
				}
			}
			if(temp > count) {
				count = temp;
			}
		}
		System.out.println("Surplus item(s):"); 
		for(int i = 0; i < inventory.size(); i++) {
			int temp = 0;
			for(int j = i; j < inventory.size(); j++) {
				if(inventory.get(j).getName().equalsIgnoreCase(inventory.get(i).getName())) {
					temp++;
				}
			}
		 	if(count == temp) {
				System.out.println(inventory.get(i).getName());
			}
		}
	}
	//If the item is in stock, remove from inventory; else remove the maximum number available
	public void sell(String itemName, int count) {
		for(int i = 0; i < inventory.size(); i++) {
			String temp = inventory.get(i).getName();
			if(count > 0 && temp.equalsIgnoreCase(itemName)) {
				inventory.remove(i);
				i--;
				count--;
			}
		}
	}
	public void printInventory() {
		System.out.printf("Items: %d%n", inventory.size());
		for(int i = 0; i < inventory.size(); i++) {
			Item temp = inventory.get(i);
			System.out.println(temp.getName() + ", $" + temp.getPrice() + ", " + temp.getSKU());
		}
	}
}