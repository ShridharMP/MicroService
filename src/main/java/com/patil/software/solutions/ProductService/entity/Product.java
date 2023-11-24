package com.patil.software.solutions.ProductService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "PRICE")
	private long price;
	@Column(name = "QUANTITY")
	private long quantity;

	public Product() {
		super();
	}

	public Product(long productId, String productName, long price, long quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}
