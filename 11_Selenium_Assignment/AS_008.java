/*URL: Swag Labs Login
The Task: Automate the login process using the provided credentials (e.g., standard_user and secret_sauce).
The Challenge: Write a Relative XPath for the "Login" button that does not rely on a static ID, assuming the ID might change upon refresh.
Key Concept: Using XPath functions like contains() or starts-with() to create robust locators for elements with potentially dynamic attributes.*/
package seleniumassignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AS_008 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");

		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(
				By.xpath("//input[contains(@id,'login-button')]")
		);

		Thread.sleep(2000);
		loginButton.click();

		Thread.sleep(4000);
		String pageTitle = driver.getTitle();

		System.out.println("Page Title after Login: " + pageTitle);
		driver.quit();
	}
}
