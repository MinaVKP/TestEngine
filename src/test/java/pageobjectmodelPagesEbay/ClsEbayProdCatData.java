package pageobjectmodelPagesEbay;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ClsEbayProdCatData {
  @Test
  public static Object[][] getData(String fpath) throws Exception
  {

	  XSSFWorkbook wb = new XSSFWorkbook(fpath);
	  XSSFSheet ws = wb.getSheet("DDFEbayInput");
	  int rows = ws.getPhysicalNumberOfRows();
	  
	 Object[][] myExcelData = new Object[rows-1][2];
	  
	  for(int i=1;i<rows;i++)
	  {
		  myExcelData[i-1][0] = ws.getRow(i).getCell(0).getStringCellValue();
		  myExcelData[i-1][1] = ws.getRow(i).getCell(1).getStringCellValue();
		  
	  }
	  wb.close();
	  
	  return myExcelData;
	  	  
  }
  
}
