package app;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Product> products = new ArrayList<>();
	/**
	 * Constructor
	 */
	Inventory(){
		products.add(new Product("Blue Jeans", "Denim Cloth, Dark Blue Color, Loose Fit", 55, 7, 1));
		products.add(new Product("Black Jeans", "Denim Cloth, Black Color, Loose Fit", 50, 5, 2));
		products.add(new Product("Gray Tee", "Pure Cotton, Gray Colorl, Blank T Shirt", 20, 15, 3));
		products.add(new Product("Black Tee", "Pure Cotton, Black Color, Blank T Shirt,", 20, 15, 4));
	}
	
	/**
	 * behavior
	 */
	public void showItems(){
		System.out.println("------------------------------------------");
		for (int i = 0; i < products.size(); i++) {
			System.out.println("{ " + products.get(i).getID()+ " }");
			System.out.println(products.get(i).getName());
			System.out.println("Description: " + products.get(i).getDescription());
			System.out.println("Price: $" + products.get(i).getPrice());
		}
	}
	
}
