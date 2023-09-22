package abstractfactory;

public class BananasFactory implements GroceryProductFactory {

	@Override
	public GroceryProduct createProduct(double productPrice) {

		GroceryProduct b = new Bananas();
		b.setPrice(productPrice);
		System.out.println("Bananas created!");
		
		return b;
	}
	
}
