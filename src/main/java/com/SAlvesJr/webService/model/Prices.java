package com.SAlvesJr.webService.model;

public class Prices {

	private int price;
	private String type;

	public Prices() {

	}

	public Prices(int price, String type) {
		super();
		this.price = price;
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
