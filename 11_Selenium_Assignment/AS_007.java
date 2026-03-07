/*URL: Practice Page
The Task: Use the "Switch Window Example" and "Switch Tab Example".
The Challenge:
Click "Open Window" to launch a new browser session.
Use getWindowHandles() to capture all IDs and switch the driver's focus to the new window.
Validate the Page Title of the new window (e.g., "All Courses") using getTitle().
Close only the child window and return the driver’s focus to the parent window to interact with the "Radio Button Example".*/
package seleniumassignment;

//Import WebDriver interface
import org.openqa.selenium.WebDriver;

//Import ChromeDriver to launch Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

//Import By class to locate elements
import org.openqa.selenium.By;

//Import Set interface to store window IDs
import java.util.Set;

public class AS_007 {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Step 2: Open the LetsKodeIt practice page
		driver.get("https://www.letskodeit.com/practice");

		// Step 3: Maximize the browser window
		driver.manage().window().maximize();

		// Wait 4 seconds so we can observe the page
		Thread.sleep(4000);

		// Step 4: Click on "Open Window" button
		driver.findElement(By.id("openwindow")).click();

		Thread.sleep(4000);

		// Step 5: Get the parent window ID
		String parentWindow = driver.getWindowHandle();

		// Step 6: Get all window IDs
		Set<String> allWindows = driver.getWindowHandles();

		// Step 7: Switch to the new (child) window
		for (String window : allWindows) {

			if (!window.equals(parentWindow)) {

				driver.switchTo().window(window);

				Thread.sleep(4000);

				// Step 8: Get and print the title of the new window
				String title = driver.getTitle();

				System.out.println("Child Window Title: " + title);

				Thread.sleep(4000);

				// Step 9: Close the child window
				driver.close();
			}
		}

		Thread.sleep(4000);

		// Step 10: Switch back to the parent window
		driver.switchTo().window(parentWindow);

		Thread.sleep(4000);

		// Step 11: Interact with the Radio Button Example
		driver.findElement(By.id("bmwradio")).click();

		Thread.sleep(4000);

		// Close the browser
		//driver.quit();
	}
}
