package chapter6Practice;

public class Hello {
	String text = "";
	
	Hello(String s){
		this.text = s;
		
	}
	
	void printText() {
		//"안녕하세요 세일즈포스 CRM101 4기 입니다."
		//한 문장씩 아래로 출력하도록 메소드 완
		String words[] = text.split("");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
			
		}
		
	}

}
