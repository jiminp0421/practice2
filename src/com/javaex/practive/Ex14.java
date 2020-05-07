package com.javaex.practive;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tax;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		tax = sc.nextDouble();
		
		
		if(0<=tax&&tax<=1000) {
			System.out.println("소득세는"+ (0.09*tax) + "입니다.");
		}else if(1000<tax&&tax<=4000) {
			System.out.println("소득세는" + (1000*0.09 + 0.18*(tax-1000) + "입니다."));
		}else if(4000<tax&&tax<8000) {
			System.out.println("소득세는" + (1000*0.09 + 3000*0.18 + 0.27*(tax-4000) + "입니다."));
		}else if (tax>=8000) {
			System.out.println("소득세는" + (1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(tax-8000) + "입니다"));
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
		
		sc.close();
	}

}
