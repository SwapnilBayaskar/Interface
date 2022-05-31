package com.JavaInterface;

public interface BaseEcommercePage {
	
	public static final String strURL = "https://shoppingkida.com";
	
	abstract void verifyLogin(String strUserName, String strPassword);
	
	abstract void verifyAddProduct();
	
	abstract void verifyPurchaseProduct();

}
