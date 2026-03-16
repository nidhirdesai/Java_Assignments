package seleniumassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pa4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
				
				driver.get("https://www.leafground.com/dashboard.xhtml");
				
				WebElement fitnessprice = driver.findElement(By.xpath("//td[text()='Fitness]/following-sibling::td"));


	}

}
