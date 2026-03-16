package seleniumassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pa_4_0 {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
	WebElement hover = driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
	
	Actions action = new Actions(driver);
	action.moveToElement(hover).perform();
	

	}

}
