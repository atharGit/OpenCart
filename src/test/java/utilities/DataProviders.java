package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

//DataProvider 1

public class DataProviders {
    @DataProvider(name="LoginData")
	public String [][] getData() throws IOException{
		String path=".//testData//Opencart_LoginData.xlsx";  //taking excel file from test data
		Excelutility xlutil=new Excelutility(path);   //create an object for excellutilty class
		int totalRows=xlutil.getRowCount("sheet1");
		int totalCols=xlutil.getCellCount("sheet1", 1);
		
		String loginData[][]=new String[totalRows][totalCols];  //created two dimentional array to which store excell sheet data
		
		for(int i=1;i<=totalRows;i++) {    //1  //read the data from xl storing data
			for(int j=0;j<totalCols;j++) { //0  //i is row and j is column
				loginData [i-1][j]=xlutil.getCellData("sheet1", i, j);
			}
			
		}
		return loginData;     //returning two dimentional array
	}
}
