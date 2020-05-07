package com.javaex.practive;

import java.util.Scanner;

public class Ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		int val1, val2; // 몫과 나머지를 담을 그릇
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자: ");
		num1 = sc.nextInt();
		System.out.println("숫자:");
		num2 = sc.nextInt();

		if(num1 > num2) {
			val1 = num1 / num2; // 몫
			val2 = num1 % num2; // 나머지
		}
		else {
			val1 = num2 / num1; // 몫
			val2 = num2 % num1; // 나머지
		}
		

		System.out.println("몫 : " + val1);
		System.out.println("나머지 : " + val2);
		
		sc.close();
	}

}
