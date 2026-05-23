import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");

        // Search
        driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
        driver.findElement(By.xpath("//input[@value='Search']")).click();

        // Add to cart
        driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

        // Click Shopping Cart (important step)
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

        // Get details
        String productName = driver.findElement(By.cssSelector("td.product a")).getText();
        String price = driver.findElement(By.cssSelector("span.product-unit-price")).getText();
        String quantity = driver.findElement(By.cssSelector("input.qty-input")).getAttribute("value");
        String total = driver.findElement(By.cssSelector("span.product-subtotal")).getText();

        // Print
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);

        driver.quit();
    }
}
