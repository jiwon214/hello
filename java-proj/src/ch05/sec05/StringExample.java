package ch05.sec05;

public class StringExample {

	public static void main(String[] args) {
		String name1 =new String( "홍길동 " );
		String name2 =new String( "java program ");
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name2.charAt(5));

	}

}
