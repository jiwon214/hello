
package ch04.sec08.practice;

import java.util.Scanner;

public class Num8StarPrint {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1;i <=num;i++) {
			for (int j = 1;j <=i;j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	
	}

}
