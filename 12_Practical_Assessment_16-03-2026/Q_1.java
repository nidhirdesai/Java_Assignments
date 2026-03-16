//Write XPath to locate the **“Enter your email address” textbox

package seleniumassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicalassessment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");
	

	}

}
