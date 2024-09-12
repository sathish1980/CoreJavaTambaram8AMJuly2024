package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelWrite {
	
	String filepath =System.getProperty("user.dir")+"\\Input\\Output.xls";
	
	String[] courses= {"python","java","SQL","PowerBI"};
	
	public void writeintoExcel() throws IOException
	{
		
		File F = new File(filepath);
		FileOutputStream FO = new FileOutputStream(F);
		HSSFWorkbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("output");
	
		for(int i=0;i<courses.length;i++)
		{
			Row row = sheet.createRow(i);
			Cell cell =row.createCell(i);
			cell.setCellValue(courses[i]);
		}
		workbook.write(FO);
		FO.close();
		System.out.println("Write operation is done");
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelWrite E = new ExcelWrite();
		E.writeintoExcel();
	}

}
