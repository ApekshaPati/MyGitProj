package pARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintCol {
public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\Dell\\Desktop\\TESTING COURSE\\mock result.xlsx");
		Sheet rr = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for (int i =0; i<=rr.getLastRowNum(); i++) {
			System.out.println(rr.getRow(i).getCell(1).getStringCellValue());
		}
 }

}
