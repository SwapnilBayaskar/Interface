package com.JavaInterface;

public class AdminPage implements BaseEcommercePage{

	@Override
	public void verifyLogin(String strUserName, String strPassword) {
		
		System.out.println("Logged in as an Admin !");
		System.out.println("Username is : "+strUserName);
		System.out.println("Password is : "+strPassword);
		
	}

	@Override
	public void verifyAddProduct() {
		
		System.out.println("\n");
		System.out.println("You are Eligible to add Product !!");
		
		String strProductID = "P123";
		String strPrice = "INR 499";
		String strCategory = "Clothes";
		String strSubCategory = "Trouser";
		
		System.out.println("Product ID : "+strProductID);
		System.out.println("Price of Product : "+strPrice);
		System.out.println("Category : "+strCategory);
		System.out.println("Sub-category :"+strSubCategory);
		
		
	}

	@Override
	public void verifyPurchaseProduct() {
		
		System.out.println("\n");
		String strCategory = "Clothes";
		String strClothType = "T-Shirts";
		String strBrandName = "Levis";
		String strSize = "Medium";
		
		System.out.println("Category of the Product : "+strCategory);
		System.out.println("Cloth Type : "+strClothType);
		System.out.println("Name of the Brand : "+strBrandName);
		System.out.println("Selected Size : "+strSize);
		
		System.out.println("Product is ordered Successfully !!");
		
		
	}
	
	

}
