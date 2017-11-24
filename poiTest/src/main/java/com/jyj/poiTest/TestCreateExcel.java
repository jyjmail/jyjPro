package com.jyj.poiTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestCreateExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建HSSFWorkbook对象  
		HSSFWorkbook workBook=new HSSFWorkbook();
		//创建HSSFSheet对象
		HSSFSheet sheet = workBook.createSheet("用户列表");
		//创建行,从0开始
		HSSFRow row = sheet.createRow(0);
		HSSFCell numCell = row.createCell(0);
		numCell.setCellValue("编号");
		
		HSSFCell nameCell = row.createCell(1);
		nameCell.setCellValue("姓名");
		
		HSSFCell ageCell = row.createCell(2);
		ageCell.setCellValue("年龄");
		
		
		HSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("001");
		row1.createCell(1).setCellValue("张三");
		row1.createCell(2).setCellValue("20");
		
		
		
		
		//将excel内容输出到指定的目录下
		FileOutputStream out=new FileOutputStream("f:\\1.xls");
		//写入到输出流
		workBook.write(out);
		
		out.flush();
		out.close();
		System.out.println("成功！！！！");
		
		
	}

}
