/***Topic:** Window Handles.
*   **Task:** Navigate to a site and click a link that opens a new tab/window.
    1.  Capture the parent window handle using `getWindowHandle()`.
    2.  Capture all open handles using `getWindowHandles()`.
    3.  Iterate through the handles, switch to the child window, verify its title, perform an action (like filling a text box), close it, and switch back to the parent window.*/
package seleniumassignment;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_019 { 

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        System.out.println("Step 1: Launching Chrome browser...");
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();
        System.out.println("Step 2: Browser window maximized");

        // Open the website
        driver.get("http://omayo.blogspot.com/");
        System.out.println("Step 3: Opened website - http://omayo.blogspot.com/");

        // Store the main window ID
        String firstWindow = driver.getWindowHandle();
        System.out.println("Step 4: Main Window ID = " + firstWindow);
        System.out.println("Current Window Title: " + driver.getTitle());

        Thread.sleep(3000);

        // Click link that opens popup window
        System.out.println("Step 5: Clicking link to open popup window...");
        driver.findElement(By.linkText("Open a popup window")).click();

        Thread.sleep(3000);

        // Get all window handles
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Step 6: Total number of windows opened = " + windows.size());

        // Create iterator to loop through windows
        Iterator<String> itr = windows.iterator();

        while (itr.hasNext()) {

            // Get window ID
            String window = itr.next();
            System.out.println("\nChecking Window ID: " + window);

            // Switch to that window
            driver.switchTo().window(window);
            System.out.println("Switched to Window with Title: " + driver.getTitle());

            // Check if it is popup window
            if (driver.getTitle().equals("Basic Web Page Title")) {

                System.out.println("Popup Window Found!");
                System.out.println("Closing Popup Window with ID: " + window);

                driver.close();
            }
        }

        Thread.sleep(3000);

        // Switch back to main window
        System.out.println("\nStep 7: Switching back to Main Window");
        driver.switchTo().window(firstWindow);

        System.out.println("Now at Window ID: " + driver.getWindowHandle());
        System.out.println("Window Title: " + driver.getTitle());

        // Type text in search box
        driver.findElement(By.name("q")).sendKeys("Arun");
    }
}
