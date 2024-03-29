package java1.day06;

import java.util.Arrays;

public class Ex1_배열 { // class s
	
	public static void main(String[] args) { // main s
	
		// [ p.168 ]
		// 1. 선언
		String[] season = { "spring" , "summer" , "fall" , "winter" };
			// String[] : String 클래스(타입) 으로 배열 선언 = string 데이터만 저장 가능!
			// season : 변수명 (스택)  // { 값1 , 값2 , 값3 } 배열에 저장 할 데이터 순서대로 작성 (힙)
		
		// 2. 호출
		System.out.println( season ); //season변수는 배열주소값을 가지고 있는 스택영역
		System.out.println( Arrays.toString( season ) );
		// Arrays.toString( 배열변수명 ) 	// 주소를 찾아서 배열의 정보 호출
	
		System.out.println( season[0] ); // 인덱스 0번 데이터 호출
		System.out.println( season[1] ); // 인덱스 1번 데이터 호출
		System.out.println( season[2] ); // 인덱스 2번 데이터 호출
		System.out.println( season[3] ); // 인덱스 3번 데이터 호출
		
		// 3. 변경 ( 새로운 값 대입 : = / 기존값을 불러와서 새로운 값을 덮어씌운다. )
		season[1] = "여름";	// season[1] "summer" = "여름"
		System.out.println( season[1] );
		
		// 4. 삭제 ( 없음 : 배열은 선언될 때 고정!!) * 해당 인덱스를 null 로 만든다
		season[1] = null;
		System.out.println( Arrays.toString( season ) );
		
		// 5. 추가 ( 없음 : 배열은 선언될 때 고정!!) * 인덱스중에 null 있으면 해당위치에 데이터 추가
		if ( season[1] == null ) season[1] = "초여름";
		else System.out.println("공간이 부족합니다.");
		System.out.println( Arrays.toString( season ) );
		
		//
		int[] scores = { 83 , 90 , 87 };	// int형 배열 선언하고 3개의 정수를 초기화
		
		// 총합 / 평균
		int sum = 0;
		for( int i = 0; i<3; i++) { // i는 0부터 3미만까지 1씩증가 [ 0 ~ 2 ] // scores배열은 [ 인덱스 : 0 ~ 2 ]
			sum += scores[i];
			// 1회전 : sum += 83 // // 2회전 : sum += 90 // 3회전 : sum += 87 
		} // for end
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/3.0);
		
		
		// [ p.173 ]
		// 1. int 형 배열
			// 1. new 연산자를 이용한 배열 선언
			int[] arr1 = new int[3];	// int 3개를 저장할 수 있는 배열 선언 [ 0 , 0 , 0 ]
				System.out.println( Arrays.toString( arr1 ) );
			
			// 2. 배열내 모든 데이터 호출
			for( int i = 0; i < 3; i++) { System.out.println( arr1[i] ); } // for end
			
			// 3. 배열내 값 변경
			arr1[0] = 10;	arr1[1] = 20;	arr1[2] = 30;
				System.out.println( Arrays.toString( arr1 ) );
		
		// 2. double 형 배열
			// 1. new 연산자를 이용한 배열 선언
			double[] arr2 = new double[3];	// double 3개를 저장할 수있는 배열 선언 [ 0.0 , 0.0 , 0.0 ]
				System.out.println( Arrays.toString( arr2 ) );
	
			// 2. 배열내 모든 데이터 호출 // 길이를 모르는경우 => 배열명.length : 배열의 길이 수 반환
												// 배열명.length  ,  문자열.length()
			for( int i = 0; i < arr2.length; i++) { System.out.println( arr2[i] ); } // for end	
					// i<=arr2.length : 0~3	// i<=arr2.length-1 : 0~2
					// i<arr2.length : 0~2
			// 3. 배열내 값 변경
			arr2[0] = 0.1; arr2[1] = 0.2; arr2[2] = 0.3;
			// arr2.push() [x] : JS에서 사용되는 함수이므로 자바에선 사용불가능
			// arr2[3] = 0.4; // 길이:3 인덱스:0~2 	이므로 없는 인덱스 호출 불가능
			// 오류 이유 : java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 at java1.day06.Ex1_배열.main(Ex1_배열.java:76)
		
		// 3. String 클래스 배열
			// 1. 선언
			String[] arr3 = new String[3];	// String 객체(문자열)을 3개 저장할 수 있는 배열 선언 [ null , null , null ]
				System.out.println( Arrays.toString( arr3 ) );
			// 2. 호출
			for( int i = 0; i<arr3.length; i++) { System.out.println(arr3[i]); }
			// 3. 값 변경
			arr3[0] = "1월"; arr3[1] = "2월"; arr3[2] = "3월";
				System.out.println( Arrays.toString( arr3 ) );
			
			// * 값 삭제 ( 불가능 : 배열은 선언시 고정 길이 이므로 , 값 대신에 기본값으로 변경 )
			arr3[1] = null;	  System.out.println( Arrays.toString( arr3 ) );
				
				// * 삭제된 인덱스 뒤 데이터를 앞으로 한칸씩 당긴 후 마지막 데이터 값을 null로 수정
				for( int i = 1; i < arr3.length; i++) {
					// 만약에 마지막인덱스에 도착했으면 다음 인덱스가 없으므로 당기기 할 필요X
					if( i == arr3.length-1 ) { arr3[i] = null; break; }
					// 마지막 인덱스가 아니면 한칸씩 당기기
					arr3[i]=arr3[i+1];
					
				} // for e
				System.out.println( Arrays.toString( arr3 ) );
			
			// * 값 추가 ( 불가능 : 배열은 선언시 고정 길이 이므로 , null 빈공간이 있으면 값 변경 )
			for( int i = 0; i < arr3.length; i++) {
				if( arr3[i] == null) { // 만약에 i번째 인덱스의 값이 비어있으면
					arr3[i] = "5월"; break; // 하나만 저장할꺼면 break 해주면 첫번째 null 값에 들어가고, break를 넣지않으면 모든 null 값에 "5월"이 다 들어감
				}
			
			}
			System.out.println( Arrays.toString( arr3 ) );
			
				
	} // main e
	
} // class e
/*
	변수 : 하나의 데이터를 저장
	배열 : 여러개의 데이터를 저장
		1. 연속적인 공간에 데이터 저장하고 나열
		2. 각 데이터공간에 인덱스를 부여
		3. 특징
			1. 배열은 선언된 타입의 값만 저장 할 수 있다.
				int[] intArray = { 1 , "dd" } 	[x]
				 * int 로 선언된 배열은 int형 데이터 저장가능
 				int[] intArray = { 1 , 3 } 		[o]
			2. 배열의 길이는 선언될 때 고정되므로 늘리거나 줄일 수 없다.
				int[] intArray = new int[길이];
				int[] intArray = new int[3];
				intArray[0] , intArray[1] , intArray[2]
				* 추가하거나 줄일 수 없다. [ 고정길이 ] 
		4. 선언
			1. 타입[] 변수명;		int[] intArray;
			2. 선언과 동시에 값 대입
				타입[] 변수명 = { 값1 , 값2 , 값3 , 값4 }
				
			3. new 연산자로 배열 생성 (기본값) 으로 생성
				타입[] 변수명 = new 타입[길이];	 * 길이 : 배열에 저장할 데이터 개수
			
*/