/* **Topic:** Basic element interaction.
*   **Task:** Navigate to the practice page and locate the **"Radio Button Example"** and **"Checkbox Example"**. Students should write a script to:
    1.  Select a specific radio button (e.g., "Honda").
    2.  Select a specific checkbox (e.g., "BMW").
    3.  Verify that only one radio button can be selected at a time, while multiple checkboxes can be selected.
*   **Key Concept:** Using `click()` for both selection and unselection.*/
package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_010 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open correct practice page
        driver.get("https://www.letskodeit.com/practice");

        Thread.sleep(4000);

        // RADIO BUTTON EXAMPLE

        // Select Honda radio button
        WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
        hondaRadio.click();

        System.out.println("Honda selected: " + hondaRadio.isSelected());

        Thread.sleep(2000);

        // Select BMW radio button
        WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
        bmwRadio.click();

        System.out.println("BMW selected: " + bmwRadio.isSelected());
        System.out.println("Honda selected after BMW click: " + hondaRadio.isSelected());

        Thread.sleep(2000);

        // CHECKBOX EXAMPLE

        // Select BMW checkbox
        WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
        bmwCheck.click();

        // Select Benz checkbox
        WebElement benzCheck = driver.findElement(By.id("benzcheck"));
        benzCheck.click();

        System.out.println("BMW checkbox selected: " + bmwCheck.isSelected());
        System.out.println("Benz checkbox selected: " + benzCheck.isSelected());

        Thread.sleep(3000);

        driver.quit();
    }
}
/*Console Output:
BMW selected: true
Honda selected after BMW click: false
BMW checkbox selected: true
Benz checkbox selected: true
*/
