package abstractfactory;

public class BananasFactory implements GroceryProductFactory {

	String bananasName = "Bananas";
	
	@Override
	public GroceryProduct createProduct() {

	
		GroceryProduct b = new Bananas();
		
		b.setPrice(FileReadingHelper.getItemPriceFromDB(bananasName));
			
		System.out.println("Bananas created!");
		
		return b;
	}
	
}
