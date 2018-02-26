package com.gc.bonuslab21;

import java.util.ArrayList;
import java.util.Hashtable;

public class CartAverage {
	private double cartAverage;
	private double cartTotal;
	Hashtable<String, Double> menu = new Hashtable<String, Double>();
	ArrayList<String> itemName = new ArrayList<String>();
	ArrayList<Double> itemPrice = new ArrayList<Double>();
	ArrayList<Integer> userCart = new ArrayList<Integer>();
	private int itemPlace = 0;
	
	public CartAverage(double cartTotal, double cartAverage) {
		this.cartTotal = cartTotal;
		this.cartAverage = cartAverage;
		for (int i = 0; i < userCart.size(); i++) {
			cartTotal =+ (itemPrice.get(itemPlace));
			cartAverage = cartTotal / (userCart.size());
		}
		
	}
	public double getCartAverage() {
		return cartAverage;
	}
	public void setCartAverage(double cartAverage) {
		this.cartAverage = cartAverage;
	}
	public double getCartTotal() {
		return cartTotal;
	}
	public void setCartTotal(double cartTotal) {
		this.cartTotal = cartTotal;
	}
	
	@Override
	public String toString() {
		return "CartAverage [cartAverage=" + cartAverage + ", cartTotal=" + cartTotal + "]";
	}
	
	
}
