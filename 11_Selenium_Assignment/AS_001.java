package seleniumassignment;

//1. Open urls using different browser using selenium webdriver using Switch case.
//use the browsers : Edge, Chrome, Firefox

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AS_001 {

  public static void main(String[] args) {

      WebDriver driver = null;

      // Change browser name here: "chrome", "firefox", "edge"
      String browser = "chrome";

      switch (browser.toLowerCase()) 
      {

          case "chrome":
              driver = new ChromeDriver();
              break;

          case "firefox":
              driver = new FirefoxDriver();
              break;

          case "edge":
              driver = new EdgeDriver();
              break;

          default:
              System.out.println("Invalid browser name");
              System.exit(0);
      }

      // Open URL
      driver.get("https://blazedemo.com/");
      // You can change URL here to test others:
      // https://petstore.octoperf.com/
      // https://www.letskodeit.com/practice
      // https://www.saucedemo.com/

      driver.manage().window().maximize();

      System.out.println("Title: " + driver.getTitle());

      // Close browser
      // driver.quit();
  }
}

//Title: BlazeDemo
