package ch04.sec08.practice;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
    
        while (true) {
            System.out.println("============================================");
            System.out.println("              [숫자 맞추기 게임 시작]            ");
            System.out.println("============================================");
            
            int num = (int) (Math.random() * 100 + 1);
            int guess = 0;
            
            while (guess != num) { 
                System.out.print("숫자를 입력하세요: ");
                guess = sc.nextInt();
                
                if (guess > num) {
                    System.out.println(" 더 낮게 !");
                } else if (guess < num) {
                    System.out.println(" 더 높게 !");
                } else {  
                    System.out.println("\t\t"+num);
                    System.out.println("  맞았습니다! ");
                }
            }

            sc.nextLine();

            System.out.print("게임을 종료하시겠습니까? (y/n) >> ");
            String option = sc.nextLine();
            
            if (option.equals("y")) {
                System.out.println("============================================");
                System.out.println("              [숫자 맞추기 게임 종료]            ");
                System.out.println("============================================");
                break;
            }
        }

    }
}

