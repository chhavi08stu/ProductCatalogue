package com.stest.product;

public class ProductBean {
	private int id;
	private String brand;
	private String color;
	private String size;
	

	
	public ProductBean(int id, String brand, String color, String size) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.size = size;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
/*
enum Color {
	RED, WHITE, BLUE;
}

enum Size {
	LARGE, MEDIUM, SMALL;
}*/