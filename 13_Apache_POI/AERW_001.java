/***Task:** Create a Java program that generates a new Excel file named `CompanyData.xlsx`.
*   **Requirements:**
    *   Create a workbook and a sheet named "Employee Info".
    *   Define a **header row** containing: "ID", "Name", and "Department".
    *   Add at least three rows of employee records using a **two-dimensional Object array**.
    *   Use a **nested for-loop** to iterate through the array and write the data into cells.
    *   Save the file to a specific local directory using `FileOutputStream`.*/

package excelsheet;

import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AERW_001 {

    public static void main(String[] args) throws Exception {

        // Create workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create sheet
        XSSFSheet sheet = workbook.createSheet("Employee Info");

        // Employee data using 2D Object array
        Object[][] data = {
                {"ID", "Name", "Department"},
                {101, "Alice", "HR"},
                {102, "Bob", "IT"},
                {103, "Charlie", "Finance"}
        };

        // Nested loops to write data into Excel
        for (int i = 0; i < data.length; i++) {

            XSSFRow row = sheet.createRow(i);

            for (int j = 0; j < data[i].length; j++) {

                row.createCell(j).setCellValue(data[i][j].toString());

            }
        }

        // Save file to local directory
        FileOutputStream file = new FileOutputStream("CompanyData.xlsx");

        workbook.write(file);

        file.close();
        workbook.close();

        System.out.println("Excel file created successfully!");
    }
}
