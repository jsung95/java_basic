package myapp;
import java.util.Scanner;

public class aaaaaa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = {'자', '축', '인', '묘', '진', '사', '오', '미', '신', '유', '술', '해'};
		
		char[] start_end = new char[2];
		
		for(int i=0; i<start_end.length; i++) {
			start_end[i] = sc.next().charAt(0);
		}
		
		
		int start_Index = 0;
		int end_Index = 0;
		
		
		
		for(int i=0; i<ary.length; i++) {
			if(ary[i] == start_end[0]) {
				start_Index = i;
			}
			if(ary[i] == start_end[1]) {
				end_Index = i;
			}
		}
		
		
		
		
		int bigger, smaller;
		
		
		int a;
		if(start_Index < end_Index) {
			a = end_Index - start_Index;
			bigger = end_Index;
			smaller = start_Index;
			
		}
		else {
			a = start_Index - end_Index;
			bigger = start_Index;
			smaller = end_Index;
			
		}
		
		
		
		
		int b;
		b = (ary.length - bigger) + smaller;
		
		
		String way = null;
		
		int distance;
		if(a > b) {
			distance = b;
			if(start_Index < end_Index) {
				way = "역방향";
			}
			else if(start_Index > end_Index) {
				way = "순방향";
			}
			else {
				way = " - ";
			}
			
		}
		else {
			distance = a;
			if(start_Index < end_Index) {
				way = "순방향";
			}
			else if(start_Index > end_Index) {
				way = "역방향";
			}
		}
		
		
		System.out.println(way);
		System.out.println("최단거리는 : " + distance);
		
		
	}
}
