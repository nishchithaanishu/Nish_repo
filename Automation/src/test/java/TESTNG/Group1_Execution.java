package TESTNG;

import org.testng.annotations.Test;

public class Group1_Execution {

	@Test(groups="integration")
	public void AddtoCart() {
		System.out.println("Add product to cart");
	}
	
	@Test(groups="system")
	public void Addtowishlist() {
		System.out.println("add product to wishlist");
	}
	
	@Test(groups="integration")
	public void AddTofav() {
		System.out.println("Add product to Fav");
	}
	
	@Test(groups="system")
	public void Removeproduct() {
		System.out.println("Remove product in cart");
	}


}
