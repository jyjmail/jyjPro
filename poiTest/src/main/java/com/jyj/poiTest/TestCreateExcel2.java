package com.jyj.poiTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.jyj.poiTest.model.User;

public class TestCreateExcel2 {

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
		
		//用户列表
		List<User> userList=new ArrayList<User>();
		userList.add(new User("001", "张三", 18));
		userList.add(new User("002", "李四", 20));
		userList.add(new User("005", "王五", 25));
		
		for (int i=0;i<userList.size();i++) {
			User user=userList.get(i);
			HSSFRow row1 = sheet.createRow(i+1);
			row1.createCell(0).setCellValue(user.getNum());
			row1.createCell(1).setCellValue(user.getName());
			row1.createCell(2).setCellValue(user.getAge().toString());
			
		}
		
		
		//将excel内容输出到指定的目录下
		FileOutputStream out=new FileOutputStream("f:\\2.xls");
		//写入到输出流
		workBook.write(out);
		
		out.flush();
		out.close();
		System.out.println("成功！！！！");
		
		
	}

}
