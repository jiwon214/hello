package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
    	
    for(int m =2;m <=9;m ++) {
    	System.out.print("***" +m+"단 ***"+"\t");
    }
    System.out.println();
    	
    	
        for (int n = 1; n <= 9; n++) {     
            for (int m = 2; m <= 9; m++) {
                System.out.print(m + " x " + n + " = " + (m * n) + "\t");
               
            }
            
            System.out.println(); 
        }
    }
}
