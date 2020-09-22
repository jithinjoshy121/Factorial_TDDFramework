package data;

import utilities.Xls_Reader;

public class DataFile {
	
	Xls_Reader d=new Xls_Reader("C:\\testing\\Fac_Data.xlsx");
	public String title=d.getCellData("Sheet1", "Title", 2);
	public String error=d.getCellData("Sheet1", "Error", 2);
	


}
