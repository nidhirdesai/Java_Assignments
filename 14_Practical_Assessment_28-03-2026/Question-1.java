package exsheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class pq1 {
	
	public static int read_excel(int row,int column) throws Exception {
		
		FileInputStream file = new FileInputStream("Numbers.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet shee = workbook.getSheetAt(0);
		
		int value = sheet.getRow(row).getCell(column).getNumberCellValue();
		
		workbook.close();
		file.close();
		
		return value;
	}
	
    public static boolean check_even(int num) {
    	return num % 2==0;
    }
	public static void main(String[] args) {
		
for(int i = 1; i<=4;i++)
{
	int num = read_excel(i,1);
	if(check_even(num))
	{
		System.out.println(num + "Even");
	}
	else 
	{
		System.out.println(num + "Odd");
	}
}
	}

}
