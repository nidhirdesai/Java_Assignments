/* **Topic:** JavaScript Alerts and popups.
*   **Task:** Use the "Switch To Alert Example". Students must handle three scenarios:
    1.  **Normal Alert:** Click a button, capture the text using `getText()`, and click "OK" via `accept()`.
    2.  **Confirmation Alert:** Click a button and close it using `dismiss()` to simulate clicking "Cancel".
    3.  **Prompt Alert:** Switch to the alert, use `sendKeys()` to enter a value, and then `accept()` it.*/
package seleniumassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_012 {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open the website
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        Thread.sleep(3000);

        // ==========================================================
        // 1) Handle Normal Alert
        // ==========================================================

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        Thread.sleep(3000);

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        Thread.sleep(3000);

        // ==========================================================
        // 2) Handle Confirmation Alert
        // ==========================================================

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

        Thread.sleep(3000);

        Alert alert2 = driver.switchTo().alert();
        alert2.accept();   // use dismiss() if you want Cancel

        Thread.sleep(3000);

        // ==========================================================
        // 3) Handle Prompt Alert
        // ==========================================================

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

        Thread.sleep(3000);

        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Welcome");
        alert3.accept();

        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}
