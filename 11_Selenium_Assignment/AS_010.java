/*URL: Practice Page
The Task: Use the Enabled/Disabled Example and Element Displayed Example.
The Challenge:
Verify that the input box is initially enabled using isEnabled().
Click the "Disable" button and write a conditional statement to confirm the input box is no longer operational.
Click the "Hide" button and use isDisplayed() to validate that the element is removed from the UI while remaining in the DOM.*/
package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_009 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Correct practice page
        driver.get("https://www.letskodeit.com/practice");

        Thread.sleep(4000);

        // Locate input box
        WebElement inputBox = driver.findElement(By.id("enabled-example-input"));

        // Verify input box initially enabled
        if(inputBox.isEnabled())
        {
            System.out.println("Input box is ENABLED.");
        }

        Thread.sleep(2000);

        // Click Disable button
        WebElement disableButton = driver.findElement(By.id("disabled-button"));
        disableButton.click();

        Thread.sleep(2000);

        // Verify input box disabled
        if(!inputBox.isEnabled())
        {
            System.out.println("Input box is now DISABLED.");
        }

        Thread.sleep(2000);

        // Displayed Example
        WebElement displayBox = driver.findElement(By.id("displayed-text"));

        // Click Hide button
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();

        Thread.sleep(2000);

        // Verify textbox hidden
        if(!displayBox.isDisplayed())
        {
            System.out.println("Textbox is hidden from UI but still present in DOM.");
        }

        Thread.sleep(3000);

        driver.quit();
    }
}
/*
Console Output:
Input box is ENABLED.
Input box is now DISABLED.
Textbox is hidden from UI but still present in DOM.
*/
