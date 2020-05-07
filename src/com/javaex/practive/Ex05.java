package com.javaex.practive;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int weight;
		int cm;
		double aver;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		cm = sc.nextInt();
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		aver = (cm-100)*0.9;
		
		if(weight<aver) {
			System.out.println("저체중입니다.");
		}else if(weight>aver) {
			System.out.println("과체중입니다.");
		}else {
			System.out.println("표준체중입니다.");
		}
		sc.close();
	}

}
