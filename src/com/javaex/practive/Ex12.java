package com.javaex.practive;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gi;
		double n1,n2;
		double n3,n4, n5, n6;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("출력되는 내용을 입력하세요.");
			System.out.print("기호: ");
			gi = sc.nextLine();
			System.out.print("숫자1: ");
			n1 = sc.nextInt();
			System.out.print("숫자2: ");
			n2 = sc.nextInt();
		}
		
		n3 = n1+n2;
		n4 = n1-n2;
		n5 = n1*n2;
		n6 = n1/n2;
		
		
		
			switch(gi){
			case "+": System.out.println("결과는: " + n3); break;
			case "-": System.out.println("결과는: " + n4); break;
			case "*": System.out.println("결과는: " + n5); break;
			case "/": 
				if(n2>0||n2<0) {
					  System.out.println("결과는: " + n6); break;
			}	else {System.out.println("계산할 수 없습니다.");} break;			
			}	
		
		
		
		
	}

}
