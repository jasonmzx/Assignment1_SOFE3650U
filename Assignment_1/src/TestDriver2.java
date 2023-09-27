import abstractfactory.ApplesFactory;
import abstractfactory.BananasFactory;
import abstractfactory.GroceryProduct;
import abstractfactory.GroceryProductFactory;

public class TestDriver2 {
	
	public static void main(String[] args) {
		
		//Debug to know which directory Java is referencing upon file read
		//Definitions of concrete factories:
		GroceryProductFactory AF = new ApplesFactory();
		GroceryProductFactory BF = new BananasFactory();
		
		//* Create Apples
		GroceryProduct apples = AF.createProduct();

		//* Create Bananas
		GroceryProduct bananas = BF.createProduct();
		
		System.out.println(apples.getPrice());
		System.out.println(bananas.getPrice());
		
		
	}


}
