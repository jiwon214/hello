package chapter5_practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//키보드에서 정수로 된 돈을 입력받고  오만원권, 만원권, 오천원권 , 천원권, 오백원권, 백원권, 오십원권, 십원권, 오원, 1원이 각 몇개로 변환되는지 프로그램 만들어
		

		int[] cash = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		System.out.print("금액 : ");
		int change = sc.nextInt();
		
		
		for (int i = 0; i <cash.length; i++) {
			System.out.println(cash[i]+" 원  : " +(change/cash[i]) + " 개 ");
			change	%= cash[i] ;
			
			
		}
		}
}
