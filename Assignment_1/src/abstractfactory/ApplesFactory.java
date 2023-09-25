package abstractfactory;

public class ApplesFactory implements GroceryProductFactory {

	String applesName = "Apples";
	
	@Override
	public GroceryProduct createProduct() {
		
		GroceryProduct a = new Apples();

		a.setPrice(FileReadingHelper.getItemPriceFromDB(applesName));
				
		System.out.println("Apples created!");
		
		return a;
	}
	
}
