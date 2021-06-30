package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class StringConcatExample {
	public static void main(String[] args) {
		
		//아래의 문자를 하나의 문자열로 만드세요
//		"LINE_1"
//		"LINE_2"
//		"LINE_3"
//		"LINE_4"
//		"LINE_5"
//		"LINE_6"
//		"LINE_7"
//		"LINE_8"
//		"LINE_9"
//		"LINE_10"
		
		String str1 = "LINE_";
		String result = "";
		for(int i=1; i<=10; i++) {
			result = result + str1 + i + " ";
			
		}
		log.info(result);
		
		
		String newLine = "\n";
		String s = "hello world".concat(newLine).concat("hello");
		log.info(s);
		
		
		
		String s2 = String.join(newLine, "hello", "world", "nice");
		log.info(s2);
		String s3 = String.join(" @ ", "hello", "world", "nice");
		log.info(s3);
		
		
		
		String s4 = new StringBuilder().
						append("hello").
						append(newLine).
						append("world").
						append(newLine).
						append("nice").toString();
		log.info(s4);
		
		
		
		char newLine2 = '\n';
		String s5 = new StringBuffer().
						append("hello").
						append(newLine2).
						append("world").
						append(newLine2).
						append(false).
						append(10).
						append(10.455).
						append("nice").toString();
		log.info(s5);
		
		
	}
}
