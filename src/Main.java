import java.io.IOException;
import java.util.Scanner;
/** import java.util.LinkedList; */

public class Main {
	
	public static void main (String [] args ) {
		
		/** Creates a linked list to hold products and their attributes.
		LinkedList<Product> pl = new LinkedList<Product>();
		
		pl.add(new Product());
		
		System.out.println(pl.get(0).toString()); */
		
		try {
			
			System.out.print("Please enter a UPC to scan: ");
			@SuppressWarnings("resource")
			Scanner userResponse = new Scanner(System.in);
			String upc = userResponse.nextLine();
			API product = new API(upc);
			
			System.out.println(product.toString());
			
		} catch (IOException e) {
			

			System.out.println("Invalid UPC, please try again.");
		}
		
		
	}

}
