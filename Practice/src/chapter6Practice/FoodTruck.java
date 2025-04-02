package chapter6Practice;

class FoodTruckMenu {
	//팥붕어빵(700),크림붕어빵(1000),호떡(700),씨앗호떡(900)를 만족하는 클래스를 완성
	//가게 운영 프로그램은 각 객체를 생성시에 원하는 종류와 가격을 세팅하고 생성하도록 변경
	//가게 운영 프로그램은 손님이 원하는 빵종류와 갯수만 알려주면 전체 받아야 할 가격을 계산
	//하는 프로그램으로 완성하시오
	
	String flavor;
	String name;
	int price;
	
	 FoodTruckMenu(String flavor, String name, int price) {
	        this.flavor = flavor;
	        this.name = name;
	        this.price = price;
	    }
	 int totalPrice (int count) { //메서드
		 int total = price *count;
	 System.out.println(flavor +name+count+"개 :" 
		 + total);
	 return   price * count;

	 }

}

	

