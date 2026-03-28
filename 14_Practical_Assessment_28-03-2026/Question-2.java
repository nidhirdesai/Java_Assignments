package exsheet;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pq2 {
	
	public static String read_excel(int row, int column) throws Exception {
		
		FileInputStream file = new FileInputStream("LoginData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		
		workbook.close();
		file.close();
		
		return data;
		
	}

	public static boolean login(String username, String password) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("	https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		boolean status = driver.findElements(By.xpath("//span[text()='Products']")).size()>0;
		driver.quit();
		
		return status;
		
	}
	
	public static void main(String[] args) throws Exception{
		
		String username = read_excel(1,1);
		String password = read_excel(1,2);
		
        boolean result = login(username,password);
        
        if(result)
        {
        	System.out.println("Login Successful");
        }
        else
        {
        	System.out.println("Login Successful");
        }

	}

}
