package ch04.sec08.practice;

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int total = 0;
		
		for(int i=1;i <=num;i++) {
	    if (i %2 ==0) {
	    	total +=i;
	    	
		} else if (num % 2== 1 && i%2 ==1) {
			
			   total += i;
			  
		   }
	    
	}
		 System.out.println("결과 : "+total);

}
}