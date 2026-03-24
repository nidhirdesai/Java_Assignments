/*Task:** Modify an existing Excel report to add a summary row programmatically.
*   **Requirements:**
    *   Load an existing file (e.g., `Books.xlsx`) that contains a list of prices in a column.
    *   Identify the last row and create a new row at the bottom for "Total Price".
    *   Use the **`setCellFormula()`** method to inject an Excel `SUM` function (e.g., `SUM(C2:C10)`) into the target cell.
    *   Handle both **`FileInputStream`** and **`FileOutputStream`** to read the existing data and then save the modifications back to the file.*/
package excelsheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AERW_004 {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("Books.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int lastRow = sheet.getLastRowNum();
        Row totalRow = sheet.createRow(lastRow + 1);
        totalRow.createCell(1).setCellValue("Total Price");
        String formula = "SUM(C2:C" + (lastRow + 1) + ")";
        totalRow.createCell(2).setCellFormula(formula);
        fis.close();
        FileOutputStream fos = new FileOutputStream("Books.xlsx");

        workbook.write(fos);

        fos.close();
        workbook.close();

        System.out.println("Summary row with total price added successfully!");
    }
}
