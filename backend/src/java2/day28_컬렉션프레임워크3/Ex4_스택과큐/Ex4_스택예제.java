package java2.day28_컬렉션프레임워크3.Ex4_스택과큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex4_스택예제 {
	public static void main(String[] args) {
		
		// 1. stack 객체(동전케이스) 선언
		Stack<Coin> coinBox = new Stack<>();
		
		// 2. 무작위로 동전 넣기
		coinBox.push( new Coin(100) );
		coinBox.push( new Coin(50) );
		coinBox.push( new Coin(500) );
		coinBox.push( new Coin(10) );
		
		// 3. 동전을 하나씩 꺼내기
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
			
		// ------------------------------------------//
		
		// 1. Queue 구현체[LinkedList<>] (동전케이스) 선언
			Queue<Coin> coinBox2 = new LinkedList<>();
			// 2. 무작위로 동전(객체) 넣기
			coinBox2.offer( new Coin(100) );
			coinBox2.offer( new Coin(50) );
			coinBox2.offer( new Coin(500) );
			coinBox2.offer( new Coin(10) );
			System.out.println(" 큐 상태 : " + coinBox2 );
			// 3. Queue 객체에서 동전(객체) 꺼내기
			coinBox2.poll();	System.out.println(" 큐 상태 : " + coinBox2 );
			
		}
	}
}
