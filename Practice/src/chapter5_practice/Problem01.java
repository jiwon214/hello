package chapter5_practice;

public class Problem01 {

	public static void main(String[] args) {
		// 3의 배수의 개수와 그합을 아레와 같이 출력하세요.

		int[] data = { 1, 3, 5, 8, 9, 11, 13, 15, 19, 18, 20, 30, 33, 31 };

		// 주어진 배열에서 3의 개수 = ?
		// 주어진 배열에서 3의 배수의 합 = ?

		int tot = 0;
		int cnt = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {

				tot += data[i];
				cnt++;

			}
		}

		System.out.println("주어진 배열에서 3의 개수 : " + cnt);
		System.out.println("주어진 배열에서 3의 배수의 합 : " + tot);

	}
}
