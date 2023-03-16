package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIExample {
	   
	static List<String> username = new ArrayList<String>();
	static List<String> password = new ArrayList<String>();
	public void readexcel() throws IOException{
		FileInputStream excel = new FileInputStream("C:\\Users\\Thiagarajan_Loganath\\Project\\Testdata.xlsx");
		
		Workbook workbook = new XSSFWorkbook(excel);
		
		Sheet sheet = (Sheet) workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.iterator();
		
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			
			Iterator<Cell> columniterator = row.iterator();
			
			int i =2;
			while(columniterator.hasNext()) {
				if(i%2==0) {
					username.add(columniterator.next().getStringCellValue());
				}else {
					password.add(columniterator.next().getStringCellValue());
				}
				i++;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ApachePOIExample obj = new ApachePOIExample();
		obj.readexcel();
		System.out.println(username);
		System.out.println(password);
	}

}
