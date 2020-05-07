package com.javaex.practive;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 15;
		Scanner sc = new Scanner(System.in);
		System.out.println("1번문제");
		age = sc.nextInt();

		if(age>0&&age<18) {
			System.out.println("청소년 입니다.");
		}
			
			
			
		
		sc.close();
		
		
	}

}
