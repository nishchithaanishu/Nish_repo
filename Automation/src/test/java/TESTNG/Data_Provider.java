package TESTNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider="logindata")
	public void LogiTest(String rowValue, String columnValue) {
	System.out.println(rowValue);
	System.out.println(columnValue);
	}
	
	
	@DataProvider(name="logindata")
	public String[][] testData(){
		String[][] data=new String[2][2];
		data[0][0]="Nishchitha";
		data[0][1]="Sampreeth";
		data[1][0]="Yuvan";
		data[1][1]="Nish";
		return data;
		
	}
	
}
