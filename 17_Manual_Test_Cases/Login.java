package project;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("zxy951@gmail.com");
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("abc@123");
		
		WebElement rememberbox = driver.findElement(By.id("RememberMe"));
		rememberbox.click();
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		login.click();
		
		String actualEmail = driver.findElement(By.xpath("//a[@class='account']")).getText();
		String expectedEmail = "zxy951@gmail.com";
		
		if(actualEmail.equals(expectedEmail))
		{
			System.out.println("Test Case Pass: Emails Match.");
		}
		else
		{
			System.out.println("Test Case Fail: Emails Do not Match.");
		}
	}

}
