package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExmaple {

	public static void main(String[] args) {
		
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동",30));
		studentList.add(new Student("감자바",20));
		studentList.add(new Student("김자바",10));
		
		//점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted()
			.forEach(s->System.out.println(s.getName()+" : "+s.getScore()));
		System.out.println();
		
		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s->System.out.println(s.getName()+" : "+s.getScore()));

	}

}
