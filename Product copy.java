package app;

public class Product {
	private String name;
	private String description;
	private int price;
	private int quantity;
	private int ID;
	
	Product(String n, String d, int p, int q, int i){
		name = n;
		description = d;
		price = p;
		quantity = q;
		ID = i;
	}
	/**
	 * setter
	 * @param n
	 */
	public void setName(String n) {
		name = n;
	}
	/**
	 * setter
	 * @param d
	 */
	public void setDescription(String d) {
		description = d;
	}
	/**
	 * setter
	 * @param p
	 */
	public void setPrice(int p) {
		price = p;
	}
	/**
	 * setter
	 * @param q
	 */
	public void setQuant(int q) {
		quantity = q;
	}
	/**
	 * setter
	 * @param i
	 */
	public void setID(int i) {
		ID = i;
	}
	
	
	/**
	 * getter
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * getter
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * getter
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * getter
	 * @return quantity
	 */
	public int getQuant() {
		return quantity;
	}
	/**
	 * getter
	 * @return ID
	 */
	public int getID() {
		return ID;
	}
	
	
}
