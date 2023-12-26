package _13유용한클래스;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _01날짜와시간 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		
		LocalTime nowTime = LocalTime.now();
		
		System.out.println(today);
		System.out.println(nowTime);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		System.out.println(Clock.systemDefaultZone());
		
		LocalDate tomorrow = today.plusDays(100);
		System.out.println(tomorrow);
		LocalDate temp2 = today.minusYears(10);
		System.out.println(temp2);
		
		
		// 두 날짜사이의 간격을 각각 년/월/일로 표시 
		LocalDate test1 = LocalDate.of(2030, 5, 5);
		Period test2 = Period.between(test1, today);
		
		System.out.println(test2.getYears());
		System.out.println(test2.getMonths());
		System.out.println(test2.getDays());
		
		// 두 날짜 사이의 간격를 일 시 분 초 단위로 각각 환산 
		Duration test3 = Duration.between(LocalDateTime.of(2023, 12, 26,0,0), LocalDateTime.of(2024, 1, 1,0,0));
		System.out.println(test3);
		System.out.println(test3.toDays()); // 일수로 환산
		System.out.println(test3.toHours()); // 시간으로 환산 
		System.out.println(test3.toMinutes()); // 분단위
		System.out.println(test3.toSeconds()); // 초단위
		System.out.println(test3.toMillis()); // 10 -3승  밀리초 단위
		System.out.println(test3.toNanos()); // 10 -9승   나노초 단위 
		
		// 날짜를 원하는 형태로 표시하기 
		
		// 날짜 객체 스트링 값으로 환산 
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("YY년 MM월 dd일 HH시");
		System.out.println(now.format(formatter1));
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy년 MMM dd일 hh시");
		System.out.println(now.format(formatter2));
		
		// String -> 날짜 객체 
		String nowData = "2023-12-26";
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate time = LocalDate.parse(nowData, formatter3);
		System.out.println(time);
		String nowData2 = "1223-12-23 18:00:00";
		DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime time2 = LocalDateTime.parse(nowData2, formatter4);
		System.out.println(time2);
		
	}

}
