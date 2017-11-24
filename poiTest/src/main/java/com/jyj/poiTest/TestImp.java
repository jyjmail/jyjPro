package com.jyj.poiTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.jyj.poiTest.model.User;

public class TestImp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       //输入 已有的excel文件
	   //输出 将excel中的数据转为List<User>--->插入到数据库
		List<User> userList=new ArrayList<User>();
		//根据excel文件获得WorkBook对象
		FileInputStream input=new FileInputStream("f:\\2.xls");
		Workbook wb=new HSSFWorkbook(input);
		//根据索引获得表单
		Sheet sheet = wb.getSheetAt(0);
		for(Row row:sheet){
			//行号
			int rowNum = row.getRowNum();
			//不处理第一行表头: 编号	姓名	年龄
			if(rowNum==0){
				
				continue;
			}
			//获取单元格
			Cell numCell = row.getCell(0);
			Cell nameCell = row.getCell(1);
			Cell ageCell = row.getCell(2);
			//将单元格的内容放入到user对象中
			User user=new User();
			user.setNum(numCell.getStringCellValue());
			user.setName(nameCell.getStringCellValue());
			user.setAge(Integer.valueOf(ageCell.getStringCellValue()));
			//将user对象放入到容器中
			userList.add(user);
			
		}
		
		for (User user : userList) {
			System.out.println(user);
		}
		
		
	}

}
