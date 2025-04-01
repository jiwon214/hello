package chapter5_practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] input = new int[5];
		int tot = 0;

		for (int i = 0; i < input.length; i++) {
			System.out.print((i + 1) + "번째 값을 입력하세요 : ");
			input[i] = sc.nextInt();

			tot += input[i];
		}

		double avg = (double) tot / input.length;
		System.out.println("평균 : " + avg);

	}

}
