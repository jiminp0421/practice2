package com.javaex.practive;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1,num2;
		int large;
		int small;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자: ");
		num2 = sc.nextInt();
		
		
		//큰수와 작은수로 확정짓는 식
		if(num1>=num2) {
			large = num1;
			small = num2;
		}else {
			large = num2;
			small = num1;
		}
		
		
		
		
		//큰수에서 작은수를 나누는 약수만 판단하는 식..
		if(large%small==0) {
			System.out.println(small + "는(은)" + large + "의 약수입니다.");
		}else {
			System.out.println(small + "는(은)" + large + "의 약수가 아닙니다.");
		}
			
		
		

		
		sc.close();

		}
		
	}



