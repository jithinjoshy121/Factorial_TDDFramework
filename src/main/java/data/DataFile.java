package data;

import utilities.Xls_Reader;

public class DataFile {
	
	Xls_Reader d=new Xls_Reader("C:\\testing\\Fac_Data.xlsx");
	public String title=d.getCellData("Sheet1", "Title", 2);
	public String error=d.getCellData("Sheet1", "Error", 2);
	public String text1=d.getCellData("Sheet1", "Text", 2);
	public String text2=d.getCellData("Sheet1", "Text", 3);
	public String output=d.getCellData("Sheet1", "Output", 2);
	
	


}
