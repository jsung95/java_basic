package myapp;

import java.util.Scanner;

import lombok.extern.log4j.Log4j;
@Log4j
public class bbbbbbbbbbbbbbb {

public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		char start = sc.next().charAt(0);	//출발지점 입력
		char end = sc.next().charAt(0);		//도착지점 입력
		
		Gods god1 = null;
		Gods god2 = null;
		
		switch(start){
			case '자' : god1 = Gods.자; break;
			case '축' : god1 = Gods.축; break;
			case '인' : god1 = Gods.인; break;
			case '묘' : god1 = Gods.묘; break;
			case '진' : god1 = Gods.진; break;
			case '사' : god1 = Gods.사; break;
			case '오' : god1 = Gods.오; break;
			case '미' : god1 = Gods.미; break;
			case '신' : god1 = Gods.신; break;
			case '유' : god1 = Gods.유; break;
			case '술' : god1 = Gods.술; break;
			case '해' : god1 = Gods.해; break;
		}
		
		switch(end){
			case '자' : god2 = Gods.자; break;
			case '축' : god2 = Gods.축; break;
			case '인' : god2 = Gods.인; break;
			case '묘' : god2 = Gods.묘; break;
			case '진' : god2 = Gods.진; break;
			case '사' : god2 = Gods.사; break;
			case '오' : god2 = Gods.오; break;
			case '미' : god2 = Gods.미; break;
			case '신' : god2 = Gods.신; break;
			case '유' : god2 = Gods.유; break;
			case '술' : god2 = Gods.술; break;
			case '해' : god2 = Gods.해; break;
		}	
		
		
		
		
		int startNum = god1.ordinal();	//출발지점 인덱스 넘버
		int endNum = god2.ordinal();		//도착지점 인덱스 넘버
	
		int distance1;	//경로 1 (큰 인덱스값에서 작은 인덱스값을 뺀 값)
		int distance2;	//경로 2 (배열.length- 큰 인덱스값) + 작은 인덱스값)
		
		if(startNum < endNum) {
			distance1 = endNum - startNum;
			distance2 = ( Gods.values().length - endNum ) + startNum;
		} else if(startNum > endNum) {
			distance1 = startNum - endNum;
			distance2 = ( Gods.values().length - startNum ) + endNum;
		} else {
			distance1 = 0;
			distance2 = 0;
		}// if - else
		
		
		int shortDistance;		//최단거리 선언
		String direction = null;	//방향 선언
		
		if(distance1 < distance2) {		//더 짧은 거리를 shortDistance에 대입
			shortDistance = distance1;
			if(startNum < endNum) {
				direction = "순방향";		//방향 대입
			} else if(startNum > endNum) {
				direction = "역방향";
			}// if - else		
		} else if(distance1 > distance2) {
			shortDistance = distance2;
			if(startNum < endNum) {
				direction = "역방향";
			} else if(startNum > endNum) {
				direction = "순방향";
			}// if - else
		} else {
				shortDistance = distance1;
				direction = "양방향 같음";
			}// else
		// if - else if - else
	
		
		
		log.info(shortDistance);
		log.info(direction);
		
		sc.close();
		
		
	}	// main
}

enum Gods{
	자,
	축,
	인,
	묘,
	진,
	사,
	오,
	미,
	신,
	유,
	술,
	해
	
	
}
