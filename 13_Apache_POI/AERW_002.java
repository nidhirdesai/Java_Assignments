/***Task:** Write a program that uses a Java **ArrayList** to populate an Excel sheet with different data types.
*   **Requirements:**
    *   Store data in an `ArrayList<Object[]>` where each object array contains a String (Name), an Integer (Age), and a Boolean (IsActive).
    *   While writing to the Excel file, use the **`instanceof` operator** to check if the data is a String, Integer, or Boolean.
    *   Implement the corresponding `setCellValue` method for each detected type to ensure data integrity.*/
package excelsheet;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AERW_002 {

    public static void main(String[] args) throws Exception {

        // Create workbook and sheet
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("User Data");

        // Create ArrayList to store rows
        ArrayList<Object[]> data = new ArrayList<>();

        // Add data (Name, Age, IsActive)
        data.add(new Object[]{"Name", "Age", "IsActive"});
        data.add(new Object[]{"Alice", 25, true});
        data.add(new Object[]{"Bob", 30, false});
        data.add(new Object[]{"Charlie", 28, true});

        int rowNum = 0;

        // Loop through ArrayList
        for (Object[] rowData : data) 
        {
            XSSFRow row = sheet.createRow(rowNum++);
            int colNum = 0;

            // Loop through each value in the row
            for (Object value : rowData)
            {
                if (value instanceof String) 
                {
                    row.createCell(colNum++).setCellValue((String) value);
                }
                else if (value instanceof Integer) 
                {
                    row.createCell(colNum++).setCellValue((Integer) value);
                }
                else if (value instanceof Boolean) 
                {
                    row.createCell(colNum++).setCellValue((Boolean) value);
                }

            }
        }
        // Save Excel file
        FileOutputStream file = new FileOutputStream("UserData.xlsx");

        workbook.write(file);

        file.close();
        workbook.close();

        System.out.println("Excel file created successfully!");
    }
}
