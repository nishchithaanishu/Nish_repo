package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeandAfter {
	@BeforeSuite
	public void beforesuit() {
		System.out.println("Beforesuite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("AfterSuite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("AfterTest");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("AfterMethod");
	}
	@Test
	public void test() {
		System.out.println("Test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void afteclass() {
		System.out.println("AfterClass");
	}
}
