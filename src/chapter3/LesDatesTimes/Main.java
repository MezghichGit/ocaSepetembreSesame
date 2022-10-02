package chapter3.LesDatesTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		// 1-creation des dates times, now() ou of()
		
		/*LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);*/
		/*
		LocalDate ld = LocalDate.of(2000, Month.AUGUST, 10);
		System.out.println(ld);
		LocalTime lt = LocalTime.of(13, 46);
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);*/
		
		//2-Manipulation
		
		/*LocalDate ld = LocalDate.of(1999, Month.MAY, 9);
		System.out.println(ld);
		System.out.println(ld.getDayOfWeek());*/
		//System.out.println(ld.minusYears(4));
		//ld = ld.minusYears(4);
		//System.out.println(ld);
		
		//Period p = Period.of(1, 3, 10);
		//ld = ld.plus(p);
		//System.out.println(ld);
		/*int d1 = ld.getDayOfMonth();
		int d2 = ld.getDayOfYear();
		System.out.println(ld.getDayOfWeek());
		System.out.println(d1);
		System.out.println(d2);*/
		
		//Period wrong = Period.ofYears(1).ofWeeks(1); 
		//System.out.println(ld.plus(wrong));	
		
		//3)Formatting
		
		LocalDate ld = LocalDate.of(1999, Month.MAY, 9);
		System.out.println(ld);
		//DateTimeFormatter monformat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		//DateTimeFormatter monformat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter monformatM = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter monformatS = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ld.format(monformatM));
		System.out.println(monformatM.format(ld));
		System.out.println(ld.format(monformatS));
		
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("MMM?dd,yyyy");
		System.out.println(ld.format(customFormat));
		
		String dateNaissance = "1985/07/10";
		DateTimeFormatter customFormat1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate mybd = LocalDate.parse(dateNaissance,customFormat1);
		System.out.println(mybd);
		
		
		
		

	}

}
