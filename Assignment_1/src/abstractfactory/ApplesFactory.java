package abstractfactory;

public class ApplesFactory implements GroceryProductFactory {

	@Override
	public GroceryProduct createProduct(double productPrice) {
		
		GroceryProduct a = new Apples();
		a.setPrice(productPrice);
		System.out.println("Apples created!");
		
		return a;
	}
	
}
