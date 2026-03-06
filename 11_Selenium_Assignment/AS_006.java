/* URL: Practice Page
The Task: Navigate to the Web Table Example.
The Challenge: Locate the "Price" of the course "Python Programming Language" without using a static row index.
Key Concept: Students must use XPath Axes (such as following-sibling::) to locate the price cell relative to the text of the course name. This prevents the script from breaking if the row order changes.*/
package seleniumassignment;

// Import WebDriver interface
import org.openqa.selenium.WebDriver;

// Import ChromeDriver to launch Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

// Import By class to locate elements
import org.openqa.selenium.By;

// Import WebElement class
import org.openqa.selenium.WebElement;

public class AS_006 {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Step 2: Open the LetsKodeIt practice page
		driver.get("https://www.letskodeit.com/practice");

		// Step 3: Maximize the browser window
		driver.manage().window().maximize();

		// Wait 4 seconds so we can observe the page
		Thread.sleep(4000);

		WebElement price = driver.findElement(
				By.xpath("//td[text()='Python Programming Language']/following-sibling::td")
		);
		
		Thread.sleep(4000);

		String coursePrice = price.getText();

		System.out.println("Price of Python Programming Language: " + coursePrice);

		Thread.sleep(4000);

		// Close the browser
		//driver.quit();
	}
}
