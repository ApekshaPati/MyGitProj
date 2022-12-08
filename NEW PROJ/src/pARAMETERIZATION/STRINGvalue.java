package pARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class STRINGvalue {
	
	public static void main(String[] args) throws IOException  {
		
	
	
	FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\TESTING COURSE\\MANUAL\\taste cases\\Book1.xlsx");
      
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
	
	System.out.println(data);
	
	
	
}
}