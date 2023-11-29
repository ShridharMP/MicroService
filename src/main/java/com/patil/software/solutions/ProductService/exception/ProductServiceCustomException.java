package com.patil.software.solutions.ProductService.exception;

import lombok.Data;

@Data
public class ProductServiceCustomException extends RuntimeException{
	private String errorMessageCode;
	public ProductServiceCustomException(String message,String errorMessageCode)
	{
		super(message);
		this.errorMessageCode=errorMessageCode;
	}
}
