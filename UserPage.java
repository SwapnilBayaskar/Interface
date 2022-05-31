package com.JavaInterface;

public class UserPage implements BaseEcommercePage{

	@Override
	public void verifyLogin(String strUserName, String strPassword) {
		
		System.out.println("Logged in as an User !");
		System.out.println("Username is : "+strUserName);
		System.out.println("Password is : "+strPassword);
		
	}

	@Override
	public void verifyAddProduct() {
		System.out.println("\n"+"XX User is not Authorized to add Product XX"+"\n");
		
	}

	@Override
	public void verifyPurchaseProduct() {
		
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
