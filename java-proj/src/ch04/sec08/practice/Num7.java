package ch04.sec08.practice;

import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {
		
		int option;
	    int totalCost = 1000;
	    int balance = 20000;
	    int Cost = 2000;

        while (true) {
        	Scanner scanner = new Scanner(System.in);
        	
        	System.out.println("----------------------------------");
			System.out.println("1.예금  | 2.출금  | 3.조회 | 4. 종료 ");
			System.out.println("----------------------------------");
			System.out.print("선택: ");
		    String strNum = scanner.nextLine();

            if(strNum.equals("1")){
             System.out.println("예금액 > "+totalCost);
             
            } else if (strNum.equals("2")) {
                System.out.println("출금액  > "+ Cost);
                
            } else if (strNum.equals("3")) {
                System.out.println("잔고 > " + balance);
                
            } else if (strNum.equals("4")) {
                System.out.println("종료  ");
               break;
                
            }
            
	}
  }
}	
	
	
