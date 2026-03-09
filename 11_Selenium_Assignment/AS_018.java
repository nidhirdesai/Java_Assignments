/*Topic:** Source and Target element interaction.
*   **Task:** 
    1.  Identify a "Source" element (e.g., a city like "Rome") and a "Target" element (e.g., a country like "Italy").
    2.  Use the `dragAndDrop(source, target).perform()` method to move the element.
    3.  Implement a more complex scenario: Drag and drop multiple financial items (like "Bank" and "Sales") into their respective debit and credit columns in a balance sheet.*/
package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AS_018 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Actions act = new Actions(driver);

        Thread.sleep(4000);

        // TASK 1 & TASK 2
        // Source - Target Drag Drop (Example)
        driver.get("https://jqueryui.com/droppable/");

        Thread.sleep(3000);

        // Switch to iframe containing drag element
        driver.switchTo().frame(0);

        Thread.sleep(4000);

        // Identify source element
        WebElement source = driver.findElement(By.id("draggable"));

        // Identify target element
        WebElement target = driver.findElement(By.id("droppable"));

        // Perform drag and drop
        act.dragAndDrop(source, target).perform();

        Thread.sleep(3000);

        // Return to main page
        driver.switchTo().defaultContent();

        Thread.sleep(3000);

        // TASK 3
        // Financial Items Drag Drop (Balance Sheet)
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        Thread.sleep(3000);

        // Locate financial elements
        WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));

        // Locate debit and credit columns
        WebElement debitAccount = driver.findElement(By.id("bank"));
        WebElement creditAccount = driver.findElement(By.id("loan"));

        // Drag BANK - Debit column
        act.dragAndDrop(bank, debitAccount).perform();

        Thread.sleep(3000);

        // Drag SALES - Credit column
        act.dragAndDrop(sales, creditAccount).perform();

        Thread.sleep(3000);
        driver.quit();
    }
}
