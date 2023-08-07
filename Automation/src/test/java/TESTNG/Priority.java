package TESTNG;

import org.testng.annotations.Test;

public class Priority {
	
	
	//if we give priority 1,-1 ,0, 2 then it will execute -1,0,1,2
	//if we will not give priority means then it will execute first then negative number then, 0 then, positive numbers
	//if we give same priority for the 2 test cases the it will execute from alphabetical order.
	//if we will give priority means then it will execute from Alphabetical order.
	@Test(priority=0)
	public void Register() {
		System.out.println("Register to the app");
	}
	
	@Test(priority=-1)
	public void Searchproduct() {
		System.out.println("Search for product");
	}
	
	@Test(priority=2)
	public void  addtocart() {
		System.out.println("Add product to cart");
	}
	
	@Test
	public void LOgin() {
		System.out.println("Login to app");
	}


}
