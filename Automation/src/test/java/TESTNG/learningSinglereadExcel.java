package TESTNG;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class learningSinglereadExcel{
	static Workbook workbook;
	public static void main(String[] args) {
		readMultipledata("Log");
	}
	public static String[][] readMultipledata(String sheetName){
		File file= new File("./TestData/Testdata.xlsx");
		 try {
			 FileInputStream fis=new FileInputStream(file);
			workbook  = WorkbookFactory.create(fis); 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		Sheet sheet=workbook.getSheet(sheetName);
		int row_size=sheet.getPhysicalNumberOfRows();
		int col_size=sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data=new String[row_size-1][col_size];
		 
		for(int i=0; i<row_size-1; i++) {
			for(int j=0; j<col_size; j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
	}

}
