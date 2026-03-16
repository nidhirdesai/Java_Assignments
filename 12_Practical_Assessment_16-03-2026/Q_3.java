package seleniumassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pa_3 {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demo.automationtesting.in/Frames.html");
				
	 driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
	 
	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
	 
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Training");


	}

}
