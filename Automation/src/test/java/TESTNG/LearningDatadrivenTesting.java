package TESTNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDatadrivenTesting {
	@Test(dataProvider="loginData")
	public void loginTest(String rowValue , String colValue) {
		System.out.println(rowValue);
		System.out.println(colValue);
	}
	
	
	@DataProvider(name="loginData")
	public String[][] testData(){
		String[][] data=learningSinglereadExcel.readMultipledata("Log");
		return data;
		
	}

}
