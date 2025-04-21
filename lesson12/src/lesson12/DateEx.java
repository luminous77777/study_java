package lesson12;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//epoch time, 유닉스 시간 1970년 1월 1일
		
		//오늘 날짜
		Date today = new Date(125,3,21);
		//수료 날짜
		Date endDate = new Date(125,8,29);
		
		
		long duration = endDate.getTime() - today.getTime();
		
		System.out.println(duration /1000 / 60 / 60 / 24);
		
	}
	
	
}
