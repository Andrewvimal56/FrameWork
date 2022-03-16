package framework.baseclass.Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExample {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\andre\\eclipse-workspace\\FrameWork\\Sheet\\Data.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Data");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Vimal");
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}
}
