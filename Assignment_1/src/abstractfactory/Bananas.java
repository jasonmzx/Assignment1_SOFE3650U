package abstractfactory;

public class Bananas implements GroceryProduct {
	
	//Instance Variables
	private double price;
	
	//Price Setters & Getters
	
	@Override
	public void setPrice(double newBananasPrice) {
		this.price = newBananasPrice;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
}
