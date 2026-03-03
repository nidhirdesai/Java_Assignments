/*
Assignment-2:
------------ 
Form Interaction & Dropdowns (BlazeDemo)
Target URL: https://blazedemo.com/
Locators to Practice: Name, XPath, Tag Name.

Instructions:

Navigate to the site and locate the "Departure City" and "Destination City" dropdowns.
Select "Mexico City" as the departure and "London" as the destination.
Click the "Find Flights" button.
On the results page, use a relative XPath to click the "Choose This Flight" button for the third flight listed in the table.
Fill out the "Purchase" form using Name locators for the text fields (Name, Address, City, etc.). */
package seleniumassignment;

//Form Interaction & Dropdowns (BlazeDemo)
//Target URL: https://blazedemo.com/
//Locators to Practice: Name, XPath, Tag 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AS_002 {

  public static void main(String[] args) throws InterruptedException {

      // Step 1: Launch Browser
      WebDriver driver = new ChromeDriver();
      driver.get("https://blazedemo.com/");
      driver.manage().window().maximize();

      // Step 2: Locate Departure Dropdown (Name Locator)
      WebElement departure = driver.findElement(By.name("fromPort"));
      Select depSelect = new Select(departure);
      depSelect.selectByVisibleText("Mexico City");
      
      Thread.sleep(5000);

      // Step 3: Locate Destination Dropdown (Name Locator)
      WebElement destination = driver.findElement(By.name("toPort"));
      Select destSelect = new Select(destination);
      destSelect.selectByVisibleText("London");
      
      Thread.sleep(5000);

      // Step 4: Click Find Flights (Tag Name Locator)
      driver.findElement(By.tagName("input")).click();
      
      Thread.sleep(5000);

      // Step 5: Click 3rd Choose This Flight (Relative XPath)
      driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
      
      Thread.sleep(5000);

      // Step 6: Fill Purchase Form (Name Locator)

      driver.findElement(By.name("inputName")).sendKeys("John Doe");
      driver.findElement(By.name("address")).sendKeys("123 Main Street");
      driver.findElement(By.name("city")).sendKeys("New York");
      driver.findElement(By.name("state")).sendKeys("NY");
      driver.findElement(By.name("zipCode")).sendKeys("10001");
      driver.findElement(By.name("creditCardNumber")).sendKeys("1234567812345678");
      driver.findElement(By.name("nameOnCard")).sendKeys("John Doe"); 
      
      Thread.sleep(7000);

      // Optional: Click Purchase Flight
      driver.findElement(By.xpath("//input[@type='submit']")).click();

      // Wait 3 seconds to see confirmation
      Thread.sleep(10000);

      // Close browser
      driver.quit();
  }
}
