/* **Topic:** The `Actions` class.
*   **Task:** 
    1.  **Mouse Over:** Navigate to a menu (like "Desktops"), hover over it to reveal sub-menus, hover over a sub-item (like "Mac"), and then click it.
    2.  **Right-Click:** Perform a `contextClick()` on a specific button to trigger a context menu, then select an option from that menu (e.g., "Copy").*/
package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AS_016 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Create Actions object
        Actions act = new Actions(driver);

        // TASK 1 : Mouse Hover - Reveal submenu - Click
        driver.get("https://the-internet.herokuapp.com/hovers");

        Thread.sleep(3000);

        // Locate first profile image
        WebElement profile = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));

        // Hover over the image to reveal submenu
        act.moveToElement(profile).perform();

        Thread.sleep(3000);

        // Click the profile link that appears
        WebElement viewProfile = driver.findElement(By.xpath("//a[text()='View profile']"));
        viewProfile.click();

        Thread.sleep(3000);
}
}
