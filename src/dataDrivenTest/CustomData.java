package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="TestData")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Smita","test123"},{"Admin","admin123"}};
		return data;
	}
	
	
	
	@DataProvider(name="ExcelFile")
	public Object[][] fileData()
	{
		File f1=new File("./"+"\\TestData\\Data.xlsx");
		  FileInputStream fs;
		  XSSFWorkbook wb;
		  Object arr[][]=null;
		  try {
			fs=new FileInputStream(f1);
			wb=new XSSFWorkbook(fs);
			 
			//number of rows 
			  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
			  System.out.println("Number of rows: "+rows);
			  
			  //number of cells
			  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Number of cells: "+cells);
			  
			  //design array as size of file and store data in array from file
			 arr=new Object[rows-1][cells];//rows=6
			  
			  for(int i=1;i<rows;i++)//0 to 5
			  {
				  
				  for(int j=0;j<cells;j++)
				  {
					 arr[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
					 //System.out.print(arr[i-1][j]+" ");
				  }
				  //System.out.println();
				  
			  }
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  //Workbook-->sheet--->row--->cell--->data
		  
		  return arr; 
		  
		  
		  
		
	}
}
