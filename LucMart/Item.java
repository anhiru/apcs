public class Item {
	private String name, sku;
	private double price;
	
	public Item(String newName, double newPrice, String newSKU) {
		name = newName;
		price = newPrice;
		sku = newSKU;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getSKU() {
		return sku;
	}
	public void setPrice(double newPrice) {
		price = newPrice;
	}
}