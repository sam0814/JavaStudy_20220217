package a15_lombok;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class IphoneTest {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("현재시간: "+ now);
		
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//System.out.println(dateFormat.format(now).toString());
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("datetime: " + nowDateTime);
		
		System.out.println("datetime 표현 형식 변환: " + nowDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

		Iphone ipone12Mini = new Iphone(12, "Mini", "white", 128, LocalDate.parse("2020-01-01").getYear());
		Iphone ipone12Mini2 = new Iphone(12, "Mini", "white", 128, LocalDate.parse("2020-01-01").getYear());
		Iphone ipone13Mini= new Iphone(12, "Max", "black", 256, LocalDate.parse("2021-01-01").getYear());
		Iphone ipone12Max = new Iphone(12, "Mini", "red", 128, LocalDate.parse("2020-01-01").getYear());
		Iphone ipone13Max = new Iphone(12, "Max", "blue", 512, LocalDate.parse("2021-01-01").getYear());
		
		ipone13Mini.setColor("gray");
		
		System.out.println("두 아이폰 비교: " + (ipone12Mini.equals(ipone12Mini2)));
		
		System.out.println(ipone12Mini);
		System.out.println(ipone13Mini);
		System.out.println(ipone12Max);
		System.out.println(ipone13Max);
	}

}
