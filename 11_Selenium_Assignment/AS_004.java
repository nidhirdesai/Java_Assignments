/* Assignment-4:
------------
Advanced UI Elements (LetsKodeIt Practice)
Target URL: https://www.letskodeit.com/practice
Locators to Practice: ID, CSS Selector, Class Name.

Instructions:
Select a radio button from the "Radio Button Example" section using its ID.
Select "Apple" and "Orange" from the "Checkbox Example" section.
Handle the "Web Table Example": Locate the price of the "Python Programming Language" course using a CSS Selector.
Practice interacting with the "Mouse Hover" element to click a sub-menu item. */
package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AS_004 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");

        Thread.sleep(5000);

        // Step 1: Select Radio Button using ID
        driver.findElement(By.id("bmwradio")).click();
        System.out.println("BMW Radio Selected");

        Thread.sleep(5000);

        // Step 2: Select Checkboxes using ID
        driver.findElement(By.id("bmwcheck")).click();
        driver.findElement(By.id("benzcheck")).click();
        System.out.println("BMW & Benz Checkboxes Selected");

        Thread.sleep(5000);

        // Step 3: Select Apple & Orange from Multiple Select dropdown
        WebElement multiSelect = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(multiSelect);

        select.selectByVisibleText("Apple");
        select.selectByVisibleText("Orange");

        System.out.println("Apple & Orange Selected from Multiple Select");

        Thread.sleep(5000);

        // Step 4: Get Python Course Price using CSS Selector
        WebElement pythonPrice = driver.findElement(
                By.cssSelector("table[name='courses'] tr:nth-child(3) td:nth-child(3)")
        );

        System.out.println("Python Course Price: " + pythonPrice.getText());

        Thread.sleep(5000);

        // Step 5: Mouse Hover and click Top
        WebElement mouseHover = driver.findElement(By.id("mousehover"));
        Actions action = new Actions(driver);
        action.moveToElement(mouseHover).perform();

        Thread.sleep(5000);

        driver.findElement(By.linkText("Top")).click();

        System.out.println("Clicked Top");

        Thread.sleep(5000);

        driver.quit();
    }
}
/* Console Output:
BMW & Benz Checkboxes Selected
Apple & Orange Selected from Multiple Select
Python Course Price: 30
Clicked Top */
