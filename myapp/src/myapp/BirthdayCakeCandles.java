package myapp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import lombok.extern.log4j.Log4j2;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

@Log4j2

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles, int candlesCount) {
    	
    	List<Integer> arr = new ArrayList<>();
    	
    	// 4 4 1 3 
    	//int var = candles를 순회해서 가장 큰 값 대입 
    	int var = Collections.max(candles);
    	
    	for(int i=0; i<candlesCount; i++) {
    		
    		if(var <= candles.get(i)) {
    			arr.add(candles.get(i));
    		}//if
    		
    	}//for
    	
    	return arr.size();
    	
    }//birthdayCakeCandles

}//Result

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/jinsung/Desktop/output.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles, candlesCount);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }//main
}//end class
