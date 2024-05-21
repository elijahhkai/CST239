package app;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
	private ArrayList<Product> shoppingCart = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	private int input1;
	private int itemToPurchase;
	
	/**
	 * constructor
	 */
	ShoppingCart(){
		shoppingCart.add(new Product("Blue Jeans", "Denim Cloth, Dark Blue Color, Loose Fit", 55, 7, 1));
		shoppingCart.add(new Product("Black Jeans", "Denim Cloth, Black Color, Loose Fit", 50, 5, 2));
		shoppingCart.add(new Product("Gray Tee", "Pure Cotton, Gray Colorl, Blank T Shirt", 20, 15, 3));
		shoppingCart.add(new Product("Black Tee", "Pure Cotton, Black Color, Blank T Shirt,", 20, 15, 4));
	}
	
	/**
	 * behavior
	 */
	public void Purchase() {
		String tempName;
		int tempPrice;
		int tempQuantity;
		System.out.println("<Purchase an Item?>\n{1} - Yes\n{0} - No");
		input1 = scanner.nextInt();
		if(input1 == 1) {
			System.out.println("<Select Item ID>");
			itemToPurchase = scanner.nextInt();
			tempName = shoppingCart.get(itemToPurchase-1).getName();
			tempPrice = shoppingCart.get(itemToPurchase-1).getPrice();
			tempQuantity = shoppingCart.get(itemToPurchase-1).getQuant();
			System.out.println("------------------------------------------");
			System.out.println("<" + tempName + ">\n<Price: $" + tempPrice + ">\n<In Stock: " + tempQuantity + ">");
			System.out.println("------------------------------------------");
		}
	}
	
}
