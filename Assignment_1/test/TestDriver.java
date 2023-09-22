import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestDriver {
	
	public static void main(String[] args) {
		
		//Debug to know which directory Java is referencing upon file read
		System.out.println("Current Working DIR: " + System.getProperty("user.dir"));

		 try {
		      
			 //Read File & Scan it
			 File myObj = new File("../src/data.txt");
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();

				ApplesFactory a = new ApplesFactory();
				a.createProduct();
		      
		        System.out.println(data);
		      }
		      
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}


}
