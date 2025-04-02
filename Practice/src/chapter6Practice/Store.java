package chapter6Practice;

public class Store {
	public static void main(String[] args) {
	 Fish gansik = new Fish();
	 Hotteok food = new Hotteok();
	 
	 int totalFishPrice =   gansik.totalPrice1(3);
	 int totalHotteokPrice = food.totalPrice2(5);
	 
	int totalPrice = totalFishPrice + totalHotteokPrice;

	 
	System.out.println("총 : "+totalPrice);
	}

}
