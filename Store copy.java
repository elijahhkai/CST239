package app;

import java.util.Scanner;

public class Store {
	Inventory inventory = new Inventory();
	ShoppingCart shoppingCart = new ShoppingCart();
	Scanner scanner = new Scanner(System.in);
	private int input1;
	
	/**
	 * behavior
	 */
	public void initiate() {
		System.out.println("Lijah's Closet Online Shopping");
		System.out.println("{0} - Exit Store");
		System.out.println("{1} - View Products");
		System.out.println("{2} - View Shopping Cart");
		System.out.println("{3} - Cancel Order");
		System.out.println("{4} - Checkout");
		System.out.println("---Choose an Option---");
		
		input1 = scanner.nextInt();
		
		while (input1!= 0) {
			if(input1 == 1) {
				inventory.showItems();
				shoppingCart.Purchase();
			}
			if(input1 == 2) {
				System.out.println("Still in progress...");
			}
			if(input1 == 3) {
				System.out.println("Still in progress...");
			}
			if(input1 == 4) {
				System.out.println("Still in progress...");
			}
			break;
		}
	}
	
}
