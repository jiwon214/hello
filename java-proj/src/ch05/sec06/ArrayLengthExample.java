package ch05.sec06;

import java.util.Scanner;

public class ArrayLengthExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//배열 변수 선언과 배열 대입
		int[] scores = new int[3];
		
		System.out.println("총합과 평균을 구할 정수 3가지를 입력하세요 : ");
		
		
		
		
		//배열 항목의 총합 구하기
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			System.out.print("숫자 : ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		//배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}

