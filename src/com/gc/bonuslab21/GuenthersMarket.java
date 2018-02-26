package com.gc.bonuslab21;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class GuenthersMarket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Hashtable<String, Double> menu = new Hashtable<String, Double>();
		ArrayList<String> itemName = new ArrayList<String>();
		ArrayList<Double> itemPrice = new ArrayList<Double>();
		ArrayList<Integer> userCart = new ArrayList<Integer>();
		ArrayList<Double> cartTotal = new ArrayList<Double>();
		String cont = "y";
		String itemChoice = "";
		int itemPlace = 0;
		CartAverage average = null;
		double cartTot;

		System.out.println("Welcome to Guenther's Market!");

		// hashtable populated
		menu.put("apple", 0.99);
		menu.put("banana", 0.59);
		menu.put("cauliflower", 1.59);
		menu.put("dragonfruit", 2.19);
		menu.put("elderberry", 1.79);
		menu.put("figgy Pudding", 2.09);
		menu.put("grapefruit", 1.99);
		menu.put("honeydew", 3.49);
		// itemPrice array list populated
		itemPrice.add((menu.get("apple")));
		itemPrice.add((menu.get("banana")));
		itemPrice.add((menu.get("cauliflower")));
		itemPrice.add((menu.get("dragonfruit")));
		itemPrice.add((menu.get("elderberry")));
		itemPrice.add((menu.get("figgy Pudding")));
		itemPrice.add((menu.get("grapefruit")));
		itemPrice.add((menu.get("honeydew")));
		// itemName array list populated
		itemName.add("apple");
		itemName.add("banana");
		itemName.add("cauliflower");
		itemName.add("dragonfruit");
		itemName.add("elderberry");
		itemName.add("figgy Pudding");
		itemName.add("grapefruit");
		itemName.add("honeydew");

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("\nItem           Price");
			System.out.println("=====================");
			for (int i = 0; i < itemName.size(); i++) {
				System.out.printf("%1$-14s $%2$-6.2f", itemName.get(i), itemPrice.get(i));
				System.out.println(" ");
			} // end for loop to display arrayLists

			System.out.print("\nWhat item would you like to order?");
			itemChoice = scan.nextLine();

			switch (itemChoice.toLowerCase().charAt(0)) {
			case 'a':
				itemPlace = 0;
				break;
			case 'b':
				itemPlace = 1;
				break;
			case 'c':
				itemPlace = 2;
				break;
			case 'd':
				itemPlace = 3;
				break;
			case 'e':
				itemPlace = 4;
				break;
			case 'f':
				itemPlace = 5;
				break;
			case 'g':
				itemPlace = 6;
				break;
			case 'h':
				itemPlace = 7;
				break;
			default:
				itemPlace = 0;
				break;
			}
			System.out.println("Adding " + (itemName.get(itemPlace)) + " to cart at $" + (itemPrice.get(itemPlace)));
			userCart.add(itemPlace);

			System.out.println("Would you like to add another item? (y/n)");
			cont = scan.nextLine();
			if (!cont.equalsIgnoreCase("y")) {
				System.out.println("Here's what you got: ");
				for (int i = 0; i < userCart.size(); i++) {
					int place = userCart.get(i);
					System.out.printf("%1$-14s $%2$-6.2f\n", itemName.get(place), itemPrice.get(place));
					cartTot =+ (itemPrice.get(itemPlace));
					cartTotal.add(cartTot);
					double cartAverage = cartTot / (userCart.size());
					average = new CartAverage(cartTot, cartAverage);
				}

					System.out.print("Average price per item in order was ");
					System.out.printf("$%1$-,6.2f", average.getCartAverage());
					
					for (int i = 0; i<cartTotal.size(); i++) {
						cartTot =+ cartTotal.get(i);
					}

					
				}

		}

		scan.close();
	} // end main method

}
