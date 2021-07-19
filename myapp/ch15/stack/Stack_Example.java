package stack;

import java.util.Stack;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Stack_Example {

	// Stack을 이용한 동전통의 구현 
	public static void main(String[] args) {
		//--1. Stack 객체 생성 (요소의 타입은 구체타입으로 우리가 만든 Coin 지정)
		Stack<Coin> coinBox = new Stack<>();
		
		//--2. 새로운 동전을 넣는다.
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//--3. 동전통이 비워질 때까지, 동전을 꺼내서 무엇인가 하자!!
		while(!coinBox.isEmpty()) {
			// Stack은 LIFO(후입선출)로, pop()으로 꺼내올 때, 마지막에 들어온 값이 가장 먼저 나온다.
			Coin coin = coinBox.pop();
			log.info("꺼내온 동전 : " + coin.getValue() + "원");
		}//while
		
		
	}//main

}//end class
