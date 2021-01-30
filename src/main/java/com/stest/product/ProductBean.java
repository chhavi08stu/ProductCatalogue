package com.stest.product;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductBean {
	@Id
	@GeneratedValue
	@Column(nullable = false)
	private long id;
	@Basic(optional = false)
	@Column(nullable = false)
	private String brand;
	@Basic(optional = false)
	@Column(nullable = false)
	private String color;
	@Basic(optional = false)
	@Column(nullable = false)
	private String size;

	public ProductBean(int id, String brand, String color, String size) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.size = size;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
 * enum Color { RED, WHITE, BLUE; }
 * 
 * enum Size { LARGE, MEDIUM, SMALL; }
 */