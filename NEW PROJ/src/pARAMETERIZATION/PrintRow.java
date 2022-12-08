package pARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintRow {
	
public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\Dell\\Desktop\\TESTING COURSE\\mock result.xlsx");
		Sheet rr = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int i=0; i<=rr.getRow(0).getLastCellNum(); i++) {
			Cell data = rr.getRow(0).getCell(i);
			CellType ct = data.getCellType();
			
			if(ct == CellType.STRING) {
				System.out.print(data.getStringCellValue() + "  ");
				
			}
			else if(ct== CellType.NUMERIC) {
				System.out.print(data.getNumericCellValue() + "  ");
			}
			else if(ct== CellType.BOOLEAN) {
				System.out.print(data.getBooleanCellValue()+ "  ");
			}
			
		}

}
}