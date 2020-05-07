package com.javaex.practive;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String ap;
	 Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳: ");
		ap = sc.nextLine();
		
		switch (ap) {
		case "a": System.out.println("모음입니다"); break;
		case "e": System.out.println("모음입니다"); break;
		case "i": System.out.println("모음입니다"); break;
		case "o": System.out.println("모음입니다"); break;
		case "u": System.out.println("모음입니다"); break;
		case "b": System.out.println("자음입니다"); break;
		case "c": System.out.println("자음입니다"); break;
		case "d": System.out.println("자음입니다"); break;
		case "h": System.out.println("자음입니다"); break;
		case "j": System.out.println("자음입니다"); break;
		case "k": System.out.println("자음입니다"); break;
		case "l": System.out.println("자음입니다"); break;
		case "n": System.out.println("자음입니다"); break;
		case "m": System.out.println("자음입니다"); break;
		case "p": System.out.println("자음입니다"); break;
		case "q": System.out.println("자음입니다"); break;
		case "r": System.out.println("자음입니다"); break;
		case "s": System.out.println("자음입니다"); break;
		case "t": System.out.println("자음입니다"); break;
		case "w": System.out.println("자음입니다"); break;
		case "x": System.out.println("자음입니다"); break;
		case "y": System.out.println("자음입니다"); break;
		case "z": System.out.println("자음입니다"); break;
		default: System.out.println("잘못된 글자 입니다");break;}
		
		
		sc.close();
			}
	
		}
	
