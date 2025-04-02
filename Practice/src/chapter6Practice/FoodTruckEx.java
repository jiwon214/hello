package chapter6Practice;

public class FoodTruckEx {
	public static void main(String[] args) {
		FoodTruckMenu ftm1 = new FoodTruckMenu("팥 ","붕어빵 ",700);
		FoodTruckMenu ftm2 = new FoodTruckMenu("크림 ","붕어빵 ",1000);
		FoodTruckMenu ftm3 = new FoodTruckMenu("그냥","호떡 ",700);
		FoodTruckMenu ftm4 = new FoodTruckMenu("씨앗","호떡 ",900);
		
		int ftm1Total =ftm1.totalPrice(3);
		int ftm2Total =ftm2.totalPrice(3);
		int ftm3Total =ftm3.totalPrice(3);
		int ftm4Total =ftm4.totalPrice(3);
		
		int totalCash = ftm1Total +ftm2Total+ftm3Total+ftm4Total;
		
		System.out.println();
		System.out.println("합계: " + totalCash);
	}

}
