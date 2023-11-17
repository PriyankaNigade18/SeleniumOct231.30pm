package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ExcelDataRead {
  @Test
  public void readFile() throws IOException 
  {
	  File f1=new File("./"+"\\TestData\\Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	 
	  //Workbook-->sheet--->row--->cell--->data
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //number of rows 
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Number of rows: "+rows);
	  
	  //number of cells
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Number of cells: "+cells);
	  
	  //design array as size of file and store data in array from file
	  Object arr[][]=new Object[rows-1][cells];//rows=6
	  
	  for(int i=1;i<rows;i++)//0 to 5
	  {
		  
		  for(int j=0;j<cells;j++)
		  {
			 arr[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			 System.out.print(arr[i-1][j]+" ");
		  }
		  System.out.println();
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //String value=wb.getSheet("userdata").getRow(2).getCell(0).getStringCellValue();
//	  XSSFSheet sheet1=wb.getSheet("userdata");
//	  XSSFRow row1=sheet1.getRow(0);
//	  XSSFCell cell1=row1.getCell(0);
//	  
//	  String value=cell1.getStringCellValue();
	  //System.out.println(value);
	  
	  
	  
	  
	  
	  
	  
  }
}
