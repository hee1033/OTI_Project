package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		
		//Korean 객체 생성
		Korean k1 = new Korean("박자바","940----------");
		
		//korean 객체 데이터 읽기
		System.out.println("k1.nation : "+k1.nation);
		System.out.println("k1.name : "+k1.name);
		System.out.println("k1.ssn : "+k1.ssn);
		
		System.out.println("-----------------------------------");
		
		Korean k2 = new Korean("김자바","950----------");
		
		System.out.println("k1.nation : "+k2.nation);
		System.out.println("k1.name : "+k2.name);
		System.out.println("k1.ssn : "+k2.ssn);
	}

}
