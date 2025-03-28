package ch04.sec08.practice;

public class Problem5 {

	public static void main(String[] args) {
		
		
		for (int n = 1; n <= 10; n++) {   
			System.out.print(n +"\t");
			for (int m = 1; m <= 9; m++) {
            	System.out.print(n+m +"\t");
            }
            System.out.println(); 
        }
	}

}
/* 강사님 
 for (int n = 0; n <= 9; n++) {   

System.out.print(n +"\t");
for (int m = 1 +i; m <= 10 + i; m++) {
	System.out.print(n+m +"\t");
}
System.out.println(); 
 */