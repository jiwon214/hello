package chapter6Practice;

class Fish {
	//붕어빵 3개 호떡 5개를 만들고 가격을 출력하는 프로그램 완성
	//붕어빵 1개는 500원, 호떡 1개는 1000원이라고 가정
	// 붕어빵과 호떡클래스를 완성하고 운영하는 가게 클래스로 구동시킬수 있도록 완송하걸아...
	
	int price = 500;
	String name = "붕어빵";
	
	int totalPrice1 (int count) {
		int total1 = price * count;
		System.out.println(name+count+"개의 가격 : "+total1);
		return total1;
	}

}
class Hotteok {
	int price = 1000;
	String name = "호떡";
	
	int totalPrice2 (int count) {
		int total2 = price * count;
		System.out.println(name+count+"개의 가격 : "+total2);
		return total2;
	}
}
