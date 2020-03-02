import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.gson.*;


public class API {
	
	private ParseProduct parsedProduct;
	
	API(String upc) throws IOException {
		
		String itemUPC = upc;
		URL url = getURL(itemUPC);
		getProductInformation(url);
	}
	
	/** Getters */
	
	// Creates A Unique URL Based On UPC Given
	public URL getURL(String upc) throws MalformedURLException {
		
		URL url = new URL("https://api.upcitemdb.com/prod/trial/lookup?upc=" + upc);
		return url; 
	}
	
	// Grabs Product Information From UPCITEMB
	public void getProductInformation(URL url) throws IOException {
		
		
		// Creating new connection with URL argument with a GET request method. 
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		
		// Creating a BufferedReader and StringBuffer to read connection response. 
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		StringBuffer response = new StringBuffer();
		
		String input; 
	
		// While there is more information to be parsed, append it to the response StringBuffer. 
		while ((input = in.readLine()) != null) {
			
			response.append(input);	
		}
		
		// Close the connection and parse the StringBuffer. 
		in.close();
		parseJSON(response);
		
	}
	
	// This methods converts the StringBuffer to a string and parses it using Gson and the ParseWeather class. 
	public void parseJSON(StringBuffer response) {
		
		Gson gson = new Gson();
		parsedProduct = gson.fromJson(response.toString(), ParseProduct.class);		
	}
	
	public String toString() {
		
		return "\n\n" + parsedProduct.getTitle() +
				"\n\nUPC:  \t\t" + parsedProduct.getUPC() + "\n\nBrand:  \t" + parsedProduct.getBrand() +
				"\n\nModel:  \t" + parsedProduct.getModel() + "\n\nColor:  \t" + parsedProduct.getColor() +
				"\n\nPrice:  \t" + parsedProduct.getHRP() + "\n\n\nSpecific Merchant Information:  \t" + parsedProduct.getMerchantInformation();
		
	}
	
}
