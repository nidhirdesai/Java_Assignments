/* **Topic:** Handling frames and `defaultContent()`.
*   **Task:** Use the frame-based practice page.
    1.  Switch to the first frame using a web element locator and enter text.
    2.  Switch back to the main page using `defaultContent()` before switching to a second frame.
    3.  **Advanced:** Navigate to an **inner iframe** within Frame 3, locate a radio button inside that nested frame, and click it.*/
package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_015 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ui.vision/demo/webtest/frames/");

        //Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);

        WebElement textBox1 = driver.findElement(By.name("mytext1"));
        textBox1.sendKeys("Hello Frame1");

        driver.switchTo().defaultContent();

        //Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);

        WebElement textBox2 = driver.findElement(By.name("mytext2"));
        textBox2.sendKeys("Hello Frame2");

        driver.switchTo().defaultContent();

        //Frame 3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);

        WebElement textBox3 = driver.findElement(By.name("mytext3"));
        textBox3.sendKeys("Hello Frame3");


        //Inner iframe inside Frame3
        driver.switchTo().frame(0);

        WebElement radioButton = driver.findElement(By.xpath("//div[@role='radio']"));
        radioButton.click();

        // go back to main page
        driver.switchTo().defaultContent();
        // driver.quit();
    }
}
