package pARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CELLvalue {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\Dell\\Desktop\\TESTING COURSE\\mock result.xlsx");
		Sheet rr = WorkbookFactory.create(file).getSheet("Sheet1");

// TO GET LAST ROW NUM		
	int RR1 = rr.getLastRowNum();
		
		System.out.println(RR1);
		
// TO GET LAST CELL NUM (req row num as cell is dependent on row)	
		 short cell = rr.getRow(0).getLastCellNum();
		System.out.println(cell);
		short cell1 = rr.getRow(9).getLastCellNum( );
		System.out.println(cell1);
		
// to print cell value
		String v1 = rr.getRow(0).getCell(1).getStringCellValue();
		System.out.println(v1);
		String v2 = rr.getRow(0).getCell(2).getStringCellValue();
		System.out.println(v2);
		double v3 = rr.getRow(0).getCell(3).getNumericCellValue();
		System.out.println(v3);
		String v4 = rr.getRow(0).getCell(4).getStringCellValue();
		System.out.println(v4);
		boolean v5 = rr.getRow(0).getCell(5).getBooleanCellValue();
		System.out.println(v5);
		double v6 = rr.getRow(0).getCell(6).getNumericCellValue();
		System.out.println(v6);
		
// to get cell type
	CellType t1 = rr.getRow(0).getCell(0).getCellType();	
	System.out.println(t1);
	CellType t2 = rr.getRow(0).getCell(4).getCellType();
	System.out.println(t2);
	CellType t3 = rr.getRow(0).getCell(5).getCellType();
	System.out.println(t3);
		
	}

}
