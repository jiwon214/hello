package chapter5_practice;

public class Problem05 {

	public static void main(String[] args) {
		//배열을 사용하여 1-45까지의 숫자 중 임의의 6개의 숫자를 출력하세요. 중복 불가.
		int[] lotto = new int[6];
		
		
		
		for(int i=0; i<lotto.length; i++) {
			
		int num = (int) (Math.random() * 45 + 1);
		lotto[i] = num;
		
		
			for(int j= 0;j<i;j++) {       // j=i랑 같으면 당연 계속 돌지;;; 그니까 j<i가 되어야 맞지;;;;;
				if(lotto[i]==lotto[j]) {
					i--;
					break;
			}		
		}  
	}
		System.out.println("로또 : ");
		for(int i= 0; i<lotto.length;i++) {
			System.out.print(lotto[i] +"  ");
		}
		
	}

}
