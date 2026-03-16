package seleniumassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pa2_0 {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demo.automationtesting.in/Alerts.html");
				
	 driver.findElement(By.xpath("//button[contains(text(),'alert box')]")).click();
	 
	 driver.findElement(By.xpath("//button[contains(text(),'prompt')]")).click();
	 
	 driver.switchTo().alert().accept();
	 
	 
	 

	}

}
