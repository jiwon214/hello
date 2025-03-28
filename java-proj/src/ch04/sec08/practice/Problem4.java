package ch04.sec08.practice;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int max = 0;
		
		
		for (int i=0;i <5 ;i++) {
			System.out.print("숫자"+(i+1)+" : " );
			int input1 = sc.nextInt();
			
			if (input1 > max) {
				max = input1;	
				}
			}
		System.out.println("가장 큰 수  : " + max);

	}

}


