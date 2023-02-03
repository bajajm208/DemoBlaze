package com.demoblaze.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcle {

	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public String readData(String sheet_name, int row_num, int cell_num) {
		// provide the path of Excle sheet which is prasent inside the testData
		String path = "E:\\VelocityWorkSpace\\DemoBlaze\\src\\test\\resources\\testData\\Data.xlsx";

		try {
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheet_name);

		} catch (IOException e) {

			e.printStackTrace();
		}
		// for single sheet
//		String data = sheet.getRow(row_num).getCell(cell_num).getStringCellValue();
		// for multiple sheet
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(sheet.getRow(row_num).getCell(cell_num));
		return data;
	}

}
