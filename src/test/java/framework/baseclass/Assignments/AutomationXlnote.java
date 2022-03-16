package framework.baseclass.Assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AutomationXlnote {
	public static void main(String[] args) throws IOException {
		// Mentioning the Path of x.l
		File file = new File("C:\\Users\\andre\\eclipse-workspace\\Employee\\Sheet\\Book 1 Maven.xlsx");
		// To Get the Objects or Bytes From the file
		FileInputStream stream = new FileInputStream(file);
		// Create Work book --Collection of sheets
		Workbook book = new XSSFWorkbook(stream);
		// To get the sheet name
		Sheet sheet = book.getSheet("Employee Data");
//		// To Get Particular row in a Sheet
//		Row row = sheet.getRow(6);
//		// To get particular cell in a Sheet
//		Cell cell = row.getCell(5);
		// To get Rows Count
//		int numberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println(numberOfRows);
//		// To get Cell Count
//		int count = row.getPhysicalNumberOfCells();
//		System.out.println(count);
//		// To print Particular Row's all cell values
//		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
//			// Get Cell one by one
//			Cell cell2 = row.getCell(i);
//			System.out.print(cell2 + "  ");
//		}
//		// To iteratre all rows in a Sheet

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			// Get each row one by one
			Row row2 = sheet.getRow(i);

			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);
				// System.out.println(cell2);
				// Cell type STRING - NUMERIC
				CellType type = cell2.getCellType();
//				System.out.println(type);
				switch (type) {
				case STRING:
					String stringCell = cell2.getStringCellValue();
					System.out.println(stringCell);
					break;
				case NUMERIC:
//					if (DateUtil.isCellDateFormatted(cell2)) {
//						Date date = cell2.getDateCellValue();
//						SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
//						String dateInfo = dFormat.format(date);
//						System.out.println(dateInfo);
//					}
//					else {
//					double numericCell = cell2.getNumericCellValue();
//					BigDecimal bigDecimal = BigDecimal.valueOf(numericCell);
//					String string = bigDecimal.toString();
//					System.out.println(string);
//						
//					}
					// SHORT 
					
					if (DateUtil.isCellDateFormatted(cell2)) {

						String dateInfo = new SimpleDateFormat("dd-MM-yyyy").format(cell2.getDateCellValue());
						System.out.println(dateInfo);
					} else {

						String string = BigDecimal.valueOf(cell2.getNumericCellValue()).toString();
						System.out.println(string);
					}
//					
					break;

				default:
					break;
				}
			}
		}

	}

}
