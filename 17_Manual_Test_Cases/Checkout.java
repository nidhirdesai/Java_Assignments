package project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkout {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //LOGIN
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.id("Email")).sendKeys("zxy951@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("abc@123");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();

        //SEARCH & ADD TO CART
        driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();

        //GO TO CART
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

        //CHECKOUT
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

        //BILLING ADDRESS

        //Select "New Address"
        Select addressDropdown = new Select(driver.findElement(By.id("billing-address-select")));
        addressDropdown.selectByVisibleText("New Address");

        Select country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        country.selectByVisibleText("India");

        driver.findElement(By.id("BillingNewAddress_City")).clear();
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bangalore");

        driver.findElement(By.id("BillingNewAddress_Address1")).clear();
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Mallathahalli");

        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).clear();
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560056");

        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).clear();
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9876543210");

        driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();

        driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
        driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
        driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
        driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
        driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();

        String confirmation = driver.findElement(
        	    By.xpath("//div[@class='section order-completed']//strong")
        	).getText();

        	if (confirmation.equals("Your order has been successfully processed!")) 
        	{
        	    System.out.println("TEST CASE PASSED");
        	} else {
        	    System.out.println("TEST CASE FAILED");
        	}
    }}
