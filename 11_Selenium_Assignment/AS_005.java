/* Assignment-5:
------------
E-commerce Workflow (SauceDemo)
Target URL: https://www.saucedemo.com/
Locators to Practice: ID, Data-test attributes, Class Name.

Instructions:
Log in using the credentials provided on the page (e.g., standard_user).
Add the "Sauce Labs Backpack" to the cart by locating its "Add to cart" button via a unique ID.
Click the Shopping Cart icon (locate by Class Name).
Click "Checkout" and complete the "Your Information" page using ID locators for First Name, Last Name, and Zip Code. */
// E-commerce Workflow (SauceDemo)
// Target URL: https://www.saucedemo.com/
// Locators to Practice: ID, Data-test attributes, Class Name


package seleniumassignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AS_005 {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Step 2: Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        Thread.sleep(5000);

        // Step 3: Login using ID locators
      
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(5000);
        
        // Step 4: Wait for Products page & Add Backpack
      
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        
        Thread.sleep(5000);

        // Step 5: Click Cart icon
        driver.findElement(By.className("shopping_cart_link")).click();
        
        Thread.sleep(5000);

        // Step 6: Wait and Click Checkout
      
        driver.findElement(By.id("checkout")).click();
        
        Thread.sleep(5000);

        // Step 7: Fill Your Information
   
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("10001");
        
        Thread.sleep(5000);

        // Step 8: Click Continue
        driver.findElement(By.cssSelector("[data-test='continue']")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}

