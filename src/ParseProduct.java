public class ParseProduct {
	
	/** Creates array to grab information within item object */
	private Items items[];
	
	/** The response code from UPC website */
	String code; 
	
	/** grabs the information within the curly brackets inside of main */
	private static class Items {
		
		String title; 
		String description;
		String upc;
		String brand; 
		String model;
		String color; 
		String size; 
		String dimension;
		String weight; 
		String currency;
		String lowest_recorded_price;
		String highest_recorded_price;
			
		private Offers offers[];
		
		private static class Offers {
			
			String merchant;
			String title;
			String price;
			String link;
			
		}
		
	}
	
	public String getCode() {
		
		return code;
	}
	
	public String getTitle() {
		
		return items[0].title;
	}
	
	public String getDescription() {
		
		return items[0].description;
	}
	
	public String getUPC() {
		
		return items[0].upc;
	}
	
	public String getBrand() {
		
		return items[0].brand;
	}
	
    public String getModel() {
		
		return items[0].model;
	}

    public String getColor() {
		
		return items[0].color;
	}
    
    public String getSize() {
		
		return items[0].size;
	}
    
   public String getDimension() {
		
		return items[0].dimension;
	}
   
   public String getWeight() {
		
		return items[0].weight;
	}
   
   public String getCurrency() {
		
		return items[0].currency;
	}
   
   public String getLRP() {
		
		return items[0].lowest_recorded_price;
	}
   
   public String getHRP() {
	   
	   return "$" + items[0].highest_recorded_price;
   } 
   
   public String getMerchantInformation() {
	   
	   int size = items[0].offers.length;
	   
	   for (int i = 0; i < size; i++) {
		   
		   if (items[0].offers[i].merchant.equalsIgnoreCase("Home Depot") ||
				   items[0].offers[i].merchant.equalsIgnoreCase("Lowe's") ||
				   items[0].offers[i].merchant.equalsIgnoreCase("Target")) {
			   
			   return "\n\nMerchant: " + items[0].offers[i].merchant +
					   "\n\nTitle: " + items[0].offers[i].title + 
					   "\n\nPrice: $" + items[0].offers[i].price +
					   "\n\nLink: " + items[0].offers[i].link;
			    
		   }
			   
		
	   }
	   
	   return "No Suitable Merchant Found";
	   
   }

}
