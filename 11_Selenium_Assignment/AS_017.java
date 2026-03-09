/* **Topic:** Action chaining and `getAttribute()`.
*   **Task:** Use a page with two fields and a "Copy Text" button.
    1.  Clear "Field 1", enter "Welcome", and perform a `doubleClick()` on the button.
    2.  Verify that the text was copied to "Field 2".
    3.  **Note:** Students must explain why `getText()` returns an empty string for input boxes and must use `getAttribute("value")` instead to retrieve the text for validation.*/
package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AS_017 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Switch to the iframe that contains the example
        driver.switchTo().frame("iframeResult");

        Thread.sleep(4000);

        // Locate elements on the page
        WebElement box1 = driver.findElement(By.id("field1"));  
        WebElement box2 = driver.findElement(By.id("field2"));  
        WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));

        // TASK 1: Clear field1, enter text and double-click
        Actions act = new Actions(driver);

        // Clear Field 1
        box1.clear();
        Thread.sleep(3000);

        // Enter text
        box1.sendKeys("Welcome");
        Thread.sleep(3000);

        // Double click button
        act.doubleClick(button).perform();
        Thread.sleep(3000);

        // TASK 2: Verify text copied to Field 2
        String copiedText = box2.getAttribute("value");

        System.out.println("Captured text: " + copiedText);

        Thread.sleep(3000);

        if (copiedText.equals("Welcome")) 
        {
            System.out.println("Text copied successfully.");
        } 
        else
        {
            System.out.println("Text was NOT copied correctly.");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
