package TESTNG;

import org.testng.annotations.Test;

public class Group_execution {
	
	@Test(groups="functional")
	public void Register() {
		System.out.println("Register to the app");
	}
	
	@Test(groups="integration")
	public void Searchproduct() {
		System.out.println("Search for product");
	}
	
	@Test(groups="integration")
	public void  addtocart() {
		System.out.println("Add product to cart");
	}
	
	@Test(groups="functional")
	public void LOgin() {
		System.out.println("Login to app");
	}

}
