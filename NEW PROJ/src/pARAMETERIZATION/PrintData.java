package pARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintData {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\Dell\\Desktop\\TESTING COURSE\\mock result.xlsx");
		Sheet rr = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for (int i =0; i<=rr.getLastRowNum(); i++) {
			
			for(int j =0; j<=rr.getRow(i).getLastCellNum()-1; j++) {
				Cell data = rr.getRow(i).getCell(j);
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
				//System.out.print();
			}
			System.out.println();
		}
		
	}

}
