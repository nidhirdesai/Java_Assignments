package project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateQuantityTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");

        // Search product
        driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
        driver.findElement(By.xpath("//input[@value='Search']")).click();

        // Add to cart
        driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

        // Go to cart
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

        // Update quantity to 2
        WebElement qty = driver.findElement(By.cssSelector("input.qty-input"));
        qty.clear();
        qty.sendKeys("2");

        // Click Update cart
        driver.findElement(By.name("updatecart")).click();

        // Get details
        String productName = driver.findElement(By.cssSelector("td.product a")).getText();
        String price = driver.findElement(By.cssSelector("span.product-unit-price")).getText();
        String quantity = driver.findElement(By.cssSelector("input.qty-input")).getAttribute("value");
        String total = driver.findElement(By.cssSelector("span.product-subtotal")).getText();

        // Print details
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + total);

        // Simple validation
        if(quantity.equals("2")) {
            System.out.println("Test Case Pass");
        } else {
            System.out.println("Test Case Fail");
        }

        driver.quit();
    }
}
