package ch04.sec08.practice;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		//141p num7
		
		int balance= 0; //잔액
		int request = 0; //요청금액
		String temp = ""; //임시저장
	   Scanner sc = new Scanner(System.in);
		
	   while(true) {
		   System.out.println("----------------------------------");
		   System.out.println("1.예금 | 2. 출금 | 3. 잔고  | 4. 종료 ");
		   System.out.println("----------------------------------");
		   System.out.print("선택 >");
		   
		   
		   //메뉴 선택 입
		   temp = sc.nextLine();
		   //예금 
		   if("1".equals(temp)) {
			   //잔액 변수에 요청값 
			   System.out.print("예금 >");
			   request = Integer.parseInt(sc.nextLine());
			   balance += request;
			   System.out.println();
		   } else if("2".equals(temp)) {
			   //잔액 변수에서 요청값 차감 
			   System.out.print("출금액  >");
			  request = Integer.parseInt(sc.nextLine());
			  //잔액이 부족한 경우 
			  if(balance < request) {
				  //잔액이 부족한 경우 
				 System.out.println("잔액이 부족합니다. ");
			  }else {
				  //잔액이 충분한 경우  
			  balance -= request;
			  }
		   }else if("3".equals(temp)) {
			   System.out.println("잔액 > " +balance);
			   
		   }else if("4".equals(temp)) {
			   break;
		   }
	   }
	}

}
