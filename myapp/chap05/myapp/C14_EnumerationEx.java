package myapp;

import java.util.Calendar;

import lombok.extern.log4j.Log4j;


@Log4j
public class C14_EnumerationEx {
	public static void main(String[] args) {
		C13_Enumeration today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = C13_Enumeration.SUNDAY;
				break;
			case 2:
				today = C13_Enumeration.MONDAY;
				break;
			case 3:
				today = C13_Enumeration.TUESDAY;
				break;
			case 4:
				today = C13_Enumeration.WEDNESDAY;
				break;
			case 5:
				today = C13_Enumeration.THURSDAY;
				break;
			case 6:
				today = C13_Enumeration.FRIDAY;
				break;
			case 7:
				today = C13_Enumeration.SATURDAY;
				break;
				
			}
		log.info("오늘 요일 : " + today);
		
		if(today == C13_Enumeration.SUNDAY) {
			log.info("일요일");
		}
		else {
			log.info("그 외 요일입니다.");
		}
		
	}
}
