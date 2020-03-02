
public class Product {
	
	// Items -> May have to create child class within product 
	private String itemTitle; 
	private String itemUPC;
	private String itemDescription; 
	private String itemBrand; 
	private String itemModel; 
	private String itemDimension; 
	private String itemWeight; 
	private String itemCurrency; 
	private String itemLRP; 
	private String itemHRP; 
	private String itemImage;
	
	// Offers -> May have to create child class within product
	private String offerMerchant; 
	private String offerTitle; 
	private String offerCurrency; 
	private String offerListPrice;
	private String offerPrice;
	private String offerAvailability; 
	private String offerLink; 
	
	
	/** Constructors */
	
	// Default Constructor 
	Product() {
			
	}
	
	// Overloaded Constructor 
	Product(String iT, String iU, String iD, String iB, String iM, String iDI, String iW, String iC,
			String iL, String iH, String iI, String oM, String oT, String oC, String oL, String oP, String oA, String oLI) {
		
		// Sets item attributes
		setItemTitle(iT);
		setItemUPC(iU);
		setItemDescription(iD);
		setItemBrand(iB);
		setItemModel(iM);
		setItemDimension(iDI);
		setItemWeight(iW);
		setItemCurrency(iC);
		setItemLRP(iL);
		setItemHRP(iH);
		setItemImage(iI);
		
		// Sets offer attributes
		setOfferMerchant(oM);
		setOfferTitle(oT);
		setOfferCurrency(oC);
		setOfferListPrice(oL);
		setOfferPrice(oP);
		setOfferAvailability(oA);
		setOfferLink(oL);
			
	}
	
	/** Item Setters */
	
	// Set Item Title
	public void setItemTitle(String title) {
		
		itemTitle = title;
	}
	
	// Set Item UPC
	public void setItemUPC(String upc) {
		
		itemUPC = upc;
	}
	
	// Set Item Description
	public void setItemDescription(String description) {
		
		itemDescription = description;
	}
	
	// Set Item Brand
	public void setItemBrand(String brand) {
		
		itemBrand = brand;
	}
	
	// Set Item Model
	public void setItemModel(String model) {
		
		itemModel = model;
	}
	
	// Set Item Dimension
	public void setItemDimension(String dimension) {
		
		itemDimension = dimension;
	}
	
	// Set Item Weight
	public void setItemWeight(String weight) {
		
		itemWeight = weight;
	}
	
	// Set Item Currency 
	public void setItemCurrency(String currency) {
		
		itemCurrency = currency;
	}
	
	// Set Item Lowest Recorded Price 
	public void setItemLRP(String lrp) {
		
		itemLRP = lrp;
	}
	
	// Set Item Highest Recorded Price
	public void setItemHRP(String hrp) {
		
		itemHRP = hrp;
	}
	
	// Set Item Image
	public void setItemImage(String image) {
		
		itemImage = image;
	}
	
	/** Item Getters */
	
	// Returns Item Title
	public String getItemTitle() {
		
		return itemTitle;
	}
	
	// Returns Item UPC
	public String getItemUPC() {
		
		return itemUPC;
	}
	
	// Returns Item Description
	public String getItemDescription() {
		
		return itemDescription;
	}
	
	// Returns Item Brand
	public String getItemBrand() {
		
		return itemBrand;
	}
	
	// Returns Item Model
	public String getItemModel() {
		
		return itemModel;
	}
	
	// Returns Item Dimension
	public String getItemDimension() {
		
		return itemDimension;
	}
	
	// Returns Item Weight
	public String getItemWeight() {
		
		return itemWeight;
	}
	
	// Returns Item Currency
	public String getItemCurrency() {
		
		return itemCurrency;
	}
	
	// Returns Item Lowest Recorded Price
	public String getItemLRP() {
		
		return itemLRP;
	}
	
	// Returns Item Highest Recorded Price
	public String getItemHRP() {
		
		return itemHRP;
	}
	
	// Returns Item Image
	public String getItemImage() {
		
		return itemImage;
	}
	
		
	/** Offer Setters */
	
	// Set Offer Merchant
	public void setOfferMerchant(String merchant) {
		
		offerMerchant = merchant;
	}
	
	// Set Offer Title
	public void setOfferTitle(String title) {
		
		offerTitle = title;
	}
	
	// Set Offer Currency
	public void setOfferCurrency(String currency) {
		
		offerCurrency = currency;
	}
	
	// Set Offer List Price
	public void setOfferListPrice(String price) {
		
		offerListPrice = price;
	}
	
	// Set Offer Price
	public void setOfferPrice(String price) {
		
		offerPrice = price;
	}
	
	// Set Offer Availability
	public void setOfferAvailability(String availability) {
		
		offerAvailability = availability;
	}
	
	// Set Offer Link
	public void setOfferLink(String link) {
		
		offerLink = link;
	}
	
	/** Offer Getters */ 
	
	// Returns Offer Merchant 
	public String getOfferMerchant() {
		
		return offerMerchant;
	}
	
	// Returns Offer Title
	public String getOfferTitle() {
		
		return offerTitle;
	}
	
	// Returns Offer Currency
	public String getOfferCurrency() {
		
		return offerCurrency;
	}
	
	// Returns Offer List Price 
	public String getOfferListPrice() {
		
		return offerListPrice;
	}
	
	// Returns Price
	public String getOfferPrice() {
		
		return offerPrice;
	}
	
	// Returns Offer Availability
	public String getOfferAvailability() {
		
		return offerAvailability;
	}
	
	// Returns Offer Link
	public String getOfferLink() {
		
		return offerLink;
	}
	
	// Overloaded To String 
	
	public String toString() {
		
		return itemTitle + " " + offerLink;
		
	}
	
	
}


