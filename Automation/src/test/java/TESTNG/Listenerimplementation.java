package TESTNG;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerimplementation implements ITestListener{
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime date=LocalDateTime.now();
		String screenshotName=date.toString().replace(":","-");
		System.out.println(date.toString());
		
		
		TakesScreenshot ts=(TakesScreenshot) BaseTest.driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/"+screenshotName+".png");
	try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}


