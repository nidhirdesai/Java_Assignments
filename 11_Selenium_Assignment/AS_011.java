package seleniumassignment;

import java.util.List;                 // Import List interface to store multiple elements
import org.openqa.selenium.By;        // Import By class to locate elements
import org.openqa.selenium.WebDriver; // Import WebDriver interface
import org.openqa.selenium.WebElement;// Import WebElement class
import org.openqa.selenium.chrome.ChromeDriver; // Import ChromeDriver to run tests on Chrome browser

public class AS_011 {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch Chrome browser
        System.out.println("Step 1: Launching Chrome browser...");
        WebDriver driver = new ChromeDriver();

        // Step 2: Maximize browser window
        driver.manage().window().maximize();
        System.out.println("Step 2: Browser window maximized");

        Thread.sleep(2000);

        // Step 3: Open the website
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("Step 3: Opened website - https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);


        // ---------------------------------------------------------
        // Step 4: Locate all checkbox elements
        // ---------------------------------------------------------
        System.out.println("Step 4: Locating all checkboxes...");

        List<WebElement> checkboxes = driver.findElements(
                By.xpath("//input[@class='form-check-input' and @type='checkbox']")
        );

        System.out.println("Total number of checkboxes found: " + checkboxes.size());

        Thread.sleep(2000);


        // ---------------------------------------------------------
        // Step 5: Select first 3 checkboxes
        // ---------------------------------------------------------
        System.out.println("\nStep 5: Selecting first 3 checkboxes...");

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Selecting checkbox index: " + i);
            checkboxes.get(i).click();
            Thread.sleep(1000);
        }

        Thread.sleep(3000);


        // ---------------------------------------------------------
        // Step 6: Unselect checkboxes if already selected
        // ---------------------------------------------------------
        System.out.println("\nStep 6: Unselecting selected checkboxes...");

        for(int i = 0; i < checkboxes.size(); i++)
        {
            if(checkboxes.get(i).isSelected())
            {
                System.out.println("Unselecting checkbox index: " + i);
                checkboxes.get(i).click();
                Thread.sleep(1000);
            }
        }

        Thread.sleep(3000);


        // ---------------------------------------------------------
        // Step 7: Close the browser
        // ---------------------------------------------------------
        System.out.println("\nStep 7: Closing the browser...");
        //driver.quit();

        System.out.println("Execution completed successfully.");
    }
}
