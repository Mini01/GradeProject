package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			
			// FileReader로 읽은 데이터를 String으로 변환시켜서 얻기위한 클래스
			buffer = new BufferedReader(fr);
			while(true) {
				String strLine = buffer.readLine();
				if(strLine == null) break;
				System.out.println(strLine);
					
			}	
			// 코드가 end 부분
			// buffer나 fr
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
