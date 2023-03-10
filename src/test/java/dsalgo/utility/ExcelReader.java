package dsalgo.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {
	
	
	public static String[][] getData() throws IOException
	{
		String projectDir=System.getProperty("user.dir");
		String path=projectDir+"/src/test/resources/TestData/TestData.xlsx";
		File ExcelFile= new File(path);
		FileInputStream FIS= new FileInputStream(ExcelFile);
		XSSFWorkbook workbook= new XSSFWorkbook(FIS);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int row= sheet.getLastRowNum();
		System.out.println("rows"+row);
		Row rowcell=sheet.getRow(0);
		int totcol=rowcell.getLastCellNum();
		System.out.println("column"+totcol);
		DataFormatter format= new DataFormatter();
		String testdata[][]= new String[row][totcol];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<totcol;j++)
			{
				testdata[i-1][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
				//System.out.println(testdata[i-1][j]);
			}
		}
		
		return testdata;
	}
	public static String[][] LoginData() throws IOException
	{
		String projectDir=System.getProperty("user.dir");
		String path=projectDir+"/src/test/resources/TestData/TestData.xlsx";
		File ExcelFile= new File(path);
		FileInputStream FIS= new FileInputStream(ExcelFile);
		XSSFWorkbook workbook= new XSSFWorkbook(FIS);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		int row= sheet.getLastRowNum();
		System.out.println("rows"+row);
		Row rowcell=sheet.getRow(0);
		int totcol=rowcell.getLastCellNum();
		System.out.println("column"+totcol);
		DataFormatter format= new DataFormatter();
		String testdata[][]= new String[row][totcol];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<totcol;j++)
			{
				testdata[i-1][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(testdata[i-1][j]);
			}
		}
		
		return testdata;
	}

	public static String[][] InputData() throws IOException
	{
		String projectDir=System.getProperty("user.dir");
		String path=projectDir+"/src/test/resources/TestData/TestData.xlsx";
		File ExcelFile= new File(path);
		FileInputStream FIS= new FileInputStream(ExcelFile);
		XSSFWorkbook workbook= new XSSFWorkbook(FIS);
		XSSFSheet sheet=workbook.getSheet("Sheet3");
		int row= sheet.getLastRowNum();
		System.out.println("rows"+row);
		Row rowcell=sheet.getRow(0);
		int totcol=rowcell.getLastCellNum();
		System.out.println("column"+totcol);
		DataFormatter format= new DataFormatter();
		String testdata[][]= new String[row][totcol];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<totcol;j++)
			{
				testdata[i-1][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(testdata[i-1][j]);
			}
		}
		
		return testdata;
	}


	}


