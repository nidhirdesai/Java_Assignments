/* Assignment-3:
------------
Navigation and Search (JPetStore)
Target URL: https://petstore.octoperf.com/
Locators to Practice: Link Text, Partial Link Text, ID.

Instructions:
Click "Enter the Store" using Link Text.
Locate the Sidebar menu and click on "Fish" using Partial Link Text.
Use the Search bar (locate it by Name) to search for "Angelfish".
Identify the "Sign In" link at the top of the page using its XPath. */
package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_003 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://petstore.octoperf.com/");

        Thread.sleep(5000);

        // Step 1: Click Enter the Store (Link Text)
        driver.findElement(By.linkText("Enter the Store")).click();
        System.out.println("Clicked Enter the Store");

        Thread.sleep(5000);

        // Step 2: Click Fish from Sidebar (Reliable XPath)
        driver.findElement(By.xpath("//a[contains(@href,'categoryId=FISH')]")).click();
        System.out.println("Clicked Fish");

        Thread.sleep(5000);

        // Step 3: Search for Angelfish (Name locator)
        WebElement searchBox = driver.findElement(By.name("keyword"));
        searchBox.clear();
        searchBox.sendKeys("Angelfish");

        Thread.sleep(2000);

        driver.findElement(By.name("searchProducts")).click();
        System.out.println("Searched Angelfish");

        Thread.sleep(5000);

        // Step 4: Identify Sign In (XPath)
        WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign In']"));
        System.out.println("Sign In text: " + signIn.getText());

        Thread.sleep(5000);

        driver.quit();
    }
}
/* Console Output:
Clicked Enter the Store
Clicked Fish
Searched Angelfish
Sign In text: Sign In */
