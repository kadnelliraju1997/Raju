package dataProvider.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMultipleData {

	public void writeMultipleDataToExcel(String path, String sheetname, ArrayList<String[]> l) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet(sheetname);

		int rowNum = 0;
		for (String[] rowData : l) {
			Row row = sh.createRow(rowNum++);
			int cellNum = 0;
			for (String cellData : rowData) {
				Cell cell = row.createCell(cellNum++);
				cell.setCellValue(cellData);
			}
		}
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();

	}

}
