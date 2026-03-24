/*Develop a utility to read data from an existing Excel file that contains calculated values.
*   **Requirements:**
    *   Open an Excel file that has columns for "Salary", "Bonus", and a "Total" (where Total is a formula like `A2+B2`).
    *   Use a **switch-case statement** on `getCellType()` to identify the nature of each cell.
    *   Crucially, ensure the code can detect **`CellType.FORMULA`** and retrieve the numeric result of that formula using `getNumericCellValue()`.*/

package excelsheet;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AERW_003 {

    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("SalaryData.xlsx");
        // Create workbook object
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        // Get first sheet
        XSSFSheet sheet = workbook.getSheetAt(0);
        // Iterate through rows
        for (Row row : sheet) 
            // Iterate through cells
            for (Cell cell : row) 
            {
                switch (cell.getCellType())
                  {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    case FORMULA:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    default:
                        System.out.print("UNKNOWN\t");
                        break;
                }
            }
            System.out.println(); // next row
        }
        workbook.close();
        file.close();
        System.out.println("Excel file read successfully!");
    }
}
