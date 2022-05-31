package com.JavaInterface;

public class TestJavaInterface {

	public static void main(String[] args) {
		
		AdminPage objAdminPage = new AdminPage();		
		System.out.println("URL of Ecommerce site : "+objAdminPage.strURL);
		objAdminPage.verifyLogin("Swapnil", "Admin123");
		objAdminPage.verifyAddProduct();
		objAdminPage.verifyPurchaseProduct();
		
		System.out.println("==========================================="+"\n");
		
		UserPage objUserPage = new UserPage();		
		System.out.println("URL of Ecommerce site : "+objAdminPage.strURL);
		objUserPage.verifyLogin("VSTL", "User123");
		objUserPage.verifyAddProduct();
		objUserPage.verifyPurchaseProduct();

	}

}
