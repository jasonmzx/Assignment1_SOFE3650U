
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import abstractfactory.ApplesFactory;
import abstractfactory.BananasFactory;
import abstractfactory.GroceryProduct;
import abstractfactory.GroceryProductFactory;

public class TestDriver2 {
	
	public static void main(String[] args) {
		
		//Debug to know which directory Java is referencing upon file read
		System.out.println("Current Working DIR: " + System.getProperty("user.dir"));

		//Definitions of concrete factories:
		GroceryProductFactory AF = new ApplesFactory();
		GroceryProductFactory BF = new BananasFactory();
		
		ArrayList<String> readLines = new ArrayList();
		
		 try {
		      
			 //Read File & Scan it
			 File myObj = new File("src/data.txt");
		     Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        readLines.add(data);
		      }
		      
		      
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
		 //After Try/Catch, built products with Factories:
	      for(int i = 0; i < readLines.size(); i++) {
	    	  
		        String[] parts = readLines.get(i).split(" ");
		        
		        String productName = parts[0];
		        float productValue = Float.parseFloat(parts[1]);
		        
		        if(productName.equals("Apples")) { // APPLES FACTORY CREATION
		        	GroceryProduct apples = AF.createProduct(productValue);
		        }
		        
		        else if(productName.equals("Bananas")) { // APPLES FACTORY CREATION
		        	GroceryProduct bananas = BF.createProduct(productValue);
		        } else {
		        	System.out.print("GroceryProduct: "+productName+" doesn't have a Factory, so it can't be created!");
		        }
	      }
		
	}


}
