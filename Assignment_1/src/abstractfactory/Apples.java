package abstractfactory;

public class Apples implements GroceryProduct {
	
	//Instance Variables
	private double price;
	
	//Price Setters & Getters
	
	@Override
	public void setPrice(double newApplePrice) {
		this.price = newApplePrice;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
}
