package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	
HSSFWorkbook file;
HSSFSheet s;
	
	public String readExcel(String path,String sheetName,int r,int c) throws IOException {
		FileInputStream fin = new FileInputStream(path);
		file = new HSSFWorkbook(fin);
		s = file.getSheet("Sheet1");
		String data = s.getRow(r).getCell(c).getStringCellValue();
		file.close();
		return data;	
	}
	
	public int getLastRow(String path, String SheetName) throws IOException {
		FileInputStream fin = new FileInputStream(path);
		file = new HSSFWorkbook(fin);
		s = file.getSheet("Sheet1");
		int LastRow = s.getLastRowNum();
		return LastRow;
	}
	
//	public void writeExcel(String path,String sheetName,int r,int c, String result) throws IOException {
//		FileInputStream fin = new FileInputStream(path);
//		file = new HSSFWorkbook(fin);
//		s = file.getSheet("Sheet1");
////		s = file.getSheet("Sheet1");
////		int LastRow = s.getLastRowNum();
//		s.getRow(r).createCell(c).setCellValue(result);
//		FileOutputStream fout = new FileOutputStream(path, true);
//		file.write(fout);
//		fout.flush();
//		file.close();
//	}
	
	public static void main(String[] args) throws IOException {
		ReadExcel e = new ReadExcel();
//		String result = e.readExcel("Resources//TestData.xls", "Sheet1", 1, 0);
		int LastRow = e.getLastRow("D:\\Parameter Values\\TestData.xls", "Sheet1");
//		e.writeExcel("D:\\Parameter Values\\TestData.xls", "Sheet1", 0, 2, "Pass");
		for(int i = 0; i <= LastRow; i++) {
			String userName = e.readExcel("D:\\Parameter Values\\TestData.xls", "Sheet1", i, 0);
			String password = e.readExcel("D:\\Parameter Values\\TestData.xls", "Sheet1", i, 1);
//			System.out.print("Username "+i+" "+Username+" ");
//			System.out.print("Password "+i+" "+Password+" ");
			System.out.println(" ");
		}
	}
	

}
