package abstractfactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadingHelper {
	
	
	public static float getItemPriceFromDB(String name) {
	
	System.out.println("Current Working DIR: " + System.getProperty("user.dir"));
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
	        
	        if(name.equals(productName)) {
	        	return productValue;
	        }
      }
      
      return 0.0f;
	}
      

}
