package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[200];
		
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			
			buffer = new BufferedReader(fr);
			for(int i = 0 ; i < names.length; i++) {
				String nameLine = buffer.readLine();
				if(nameLine ==null) break;
				names[i] = nameLine;
			} // 배열에 담기
			
			buffer.close();
			fr.close();
			
			// 파일읽기를 끝내고 다른코드를 계속 실행해야 할 경우
			// 가급적(원칙적으로) buffer와 fr을 close()한다.
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try end
		
		// names 배열에는  영어이름들 200개가 담겨 있을것이다.
		for(String name : names) {
			System.out.println(name);
		}
		String s1 =names [150];
		System.out.println(s1);
		
		System.out.println(names[122]);
		
		// Alean
		// Aldin
		// Akacia
		
		// 위에서 만든 names 배열에 찾고자 하는 이름이 있는지?
		// 이름이 있으면 몇번째 배열에 있는지 ? 
		// 순차검색(제일 단순한 검색)을 이용
		
		for(int i = 0 ; i < names.length ; i ++) {
			boolean okM = names[i].contains("Akacia");
			if(okM) { // okm ==true??
				System.out.println(i+1 + "번째에서 찾음");
				System.out.println(names[i]);
				break;
			}
		}

	}

}
