package java2.day26_컬렉션프레임워크.Ex3_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex3_예제 {
	public static void main(String[] args) {
		
		// ArrayList 객체
		List<String> list1 = new ArrayList<>();
			// ArrayList vs LinkedList
			// 사용방법 동일 , 내부구조 설계 다르다.
			// 배열에 객체저장 , 객체를 체인처럼 연결
		
		// Linked List 객체
		List<String> list2 = new LinkedList<>();
		
		// 두 객체의 저장 속도 체크
		long startTime;	// 시작시간
		long endTime;	// 끝시간
		
		// 밀리초 ( 1/1000 초 ) 나노초 ( 1/1000000000 초)
		startTime = System.nanoTime();
		for( int i = 0; i<10000000; i++) { list1.add( 0 , i+"");}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList가 10000개를 저장하는데 걸리는 시간 : " + (endTime-startTime));
	
	
	}
}
