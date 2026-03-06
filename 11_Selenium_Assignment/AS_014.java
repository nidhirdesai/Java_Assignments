/***Topic:** URL injection for authentication.
*   **Task:** Provide a URL that triggers a browser-level username/password popup.
    1.  Explain why `switchTo().alert()` and standard inspection do not work for these popups.
    2.  Student must implement the **injection syntax**: `http://admin:admin@the-internet.herokuapp.com/basic_auth` to bypass the login prompt and verify the "Congratulations" message.*/
package seleniumassignment;

//Import WebDriver interface
import org.openqa.selenium.WebDriver;

//Import ChromeDriver class to launch Chrome browser
import org.openqa.selenium.chrome.ChromeDriver;

//Create class to handle authentication popup
public class AS_014 {

public static void main(String[] args) {

   // Create WebDriver object and launch Chrome browser
   WebDriver driver = new ChromeDriver();

   // Normal URL without authentication (this will show popup)
   // driver.get("http://the-internet.herokuapp.com/basic_auth");
   // Syntax for handling authentication popup in Selenium
   // http://username:password@URL
   // Example:
   // http://admin:admin@the-internet.herokuapp.com/basic_auth
   // Open the URL with username and password embedded
   driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

}
}
