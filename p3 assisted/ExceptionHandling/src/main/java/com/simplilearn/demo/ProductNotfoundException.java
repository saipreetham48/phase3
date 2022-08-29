package com.simplilearn.demo;

public class ProductNotfoundException extends Exception{
	 public ProductNotfoundException(String msg) {
		 super(msg);
		
	}

	@Override
	public String toString() {
		return "ProductNotfoundException [Not found with id 0]";
	}
	 

}
