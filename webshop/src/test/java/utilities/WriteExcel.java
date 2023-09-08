package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcel {
	
	HSSFWorkbook file;
	HSSFSheet s;
	
		
		public void Excelwrite(String path,String sheetName,int r,int c, String result) throws IOException {
			
			FileInputStream fin = new FileInputStream(path);
			file = new HSSFWorkbook(fin);
			s = file.getSheet(sheetName);
			s.getRow(r).createCell(c).setCellValue(result);
			FileOutputStream fout = new FileOutputStream(path, true);
			file.write(fout);
			fout.flush();
			file.close();
		}

		public static void main(String[] args) throws IOException {
//			ReadExcel e = new ReadExcel();	
			WriteExcel w = new WriteExcel();
//			int LastRow = e.getLastRow("Resources//TestData.xls", "Sheet1");
			w.Excelwrite("D:\\Parameter Values\\TestData.xls", "Sheet1", 0, 2, "Pass");
//			for(int i = 0; i <= 2; i++) {
//				w.Excelwrite("D:\\Parameter Values\\TestData.xls", "Sheet1", i, 2, "Pass");
////				e.writeExcel("Resources//TestData.xls", "Sheet1", i, 0);
////				e.readExcel("Resources//TestData.xls", "Sheet1", i, 1);
//			}
}
}
