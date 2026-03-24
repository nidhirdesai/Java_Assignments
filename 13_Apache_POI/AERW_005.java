/*Task:** Integrate Selenium WebDriver with Apache POI to perform data-driven web scraping.
*   **Requirements:**
    *   Use Selenium to navigate to a website containing a **WebTable**.
    *   Iterate through the rows and columns of the web table using `findElements(By.xpath(...))`.
    *   As the script scrapes each cell value from the web, simultaneously write that data into a new Excel sheet in real-time.
    *   The student must manage the **WebDriver** lifecycle while maintaining an open **POI Workbook** object to ensure all scraped data is captured before the browser closes.*/
package excelsheet;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AERW_005 {

    public static void main(String[] args) throws Exception {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("WebTable Data");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        int excelRow = 0;
        for (int i = 1; i <= rows.size(); i++) 
        {
            List<WebElement> cols = driver.findElements(
                    By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/th | //table[@id='customers']/tbody/tr[" + i + "]/td"));
            XSSFRow row = sheet.createRow(excelRow++);

            int excelCol = 0;
            for (WebElement col : cols) {
                String data = col.getText();
                row.createCell(excelCol++).setCellValue(data);
                System.out.print(data + " | ");
            }
            System.out.println();
        }
        FileOutputStream file = new FileOutputStream("WebTableData.xlsx");
        workbook.write(file);
        file.close();
        workbook.close();
        //driver.quit();

        System.out.println("WebTable data successfully written to Excel!");
    }
}
