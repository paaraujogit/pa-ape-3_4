package david.chap3;

// import time classes
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javafx.util.Duration;




public class _03_05_DatesTimes{

	public static void main(String[] args){
	
		//LocalDate - Contains just a date
		//LocalTime - Contains just a Time.
		//LocalDateTime - Contains both Date and Time but no time Zone.
		
		//...if we live in USA. Careful!! The month come before the day.
		System.out.println(LocalDate.now());	//2015-01-20
		System.out.println(LocalTime.now());	//12:45:18.401
		System.out.println(LocalDateTime.now());//2015-01-20T12:45:18.401		
		
		//Oracle recommends avoiding time zones unless you really need them.
		//...but ZoneDateTime handles them.
		
	//Other Dates and TimestampLocalDate date1 = LocalDAte.of(2015, Month.JANUARY, 20);
	//public static LocalDate of(int year, int month, int dayOfMonth)
	//public static LocalDate of(int year, Month month, int dayOfMonth)	
	LocalDate date2 = LocalDate.of(2015, 1, 20);
	System.out.println("LocalDate date2 = LocalDate.of(2015, 1, 20): "+date2);
	LocalDate date3 = LocalDate.of(2015, Month.JANUARY, 20);		
	System.out.println("LocalDate date3 = LocalDate.of(2015, Month.JANUARY, 20): "+date3);
	//public static LocalTime of(int hour, int minute)
	//public static LocalTime of(int hour, int minute, int second)
	//public static LocalTime of(int hour, int minute, int second, int nanos)
	LocalTime time1 = LocalTime.of(6, 15);			// hour and minute
	LocalTime time2 = LocalTime.of(6, 15, 30);		// + seconds
	LocalTime time3 = LocalTime.of(6, 15, 30, 200);	// + nanoseconds
	System.out.println("LocalTime time3 = LocalTime.of(6, 15, 30, 200): "+time3);	
	
	
	
	//Combining Dates and Times
	LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
	LocalDateTime dateTime2 = LocalDateTime.of(date2, time1);
	System.out.println("LocalDateTime dateTime2 = LocalDateTime.of(date2, time1): "+dateTime2);
	//Signatures
	//public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
	//public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
	//public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)
	//public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
	//public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
	//public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)
	//public static LocalDateTime of(LocalDate date, LocalTime time)
	//-------------------------------------------------------------------------------------------------------------------
	//LocalDate d = new LocalDate();		//DOES NOT COMPILE - There isn't a public constructor
	//LocalDate.of(2015, Month.January, 32);	//throws DateTimeException	- 32 is not a day of Month
	
	//----------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------
	//OLD WAY - DATES & TIMES BEFORE JAVA 8 (7..6..5..)			//NEW-WAY
	//Months war 0-based!!!
	//import java.util.*;										//import java.time.*;
	//----------------------------------------------------------------------------------------------------------
	//Creating an object with the current date
	//Date d = new Date();										//LocalDate d = LocalDate.now();
	
	//Creating an object with the current date and time
	//Date d = new Date();										//LocalDateTime dt = LocalDateTime.now();
	
	//Creating an object representing January 1, 2015	
	//Calendar c = Calendar.getInstance();						//LocalDate jan = LocalDate.of(2015, Month.JANUARY, 1);
	//c.set(2015, Calendar.JANUARY, 1);
	//Date jan = c.getTime();
	//OR
	//Calendar c = new GregorianCalendar(2015, Calendar.JANUARY, 1);
	//Date jan = c.getTime();
	//----------------------------------------------------------------------------------------------------------	
	//Creating January 1, 2015 without the constant
	//Calendar c = Calendar.getInstance();						//LocalDate jan = LocalDate.of(2015, 1, 1);
	//c.set(2015, 0, 1);
	//Date jan = c.getTime();
	//
	//Adding a day
	//Calendar cal = Calendar.getInstance();					date.plusDays(1);
	//cal.setTime(date);
	//cal.add(Calendar.DATE, 1);
	//Date date = cal.getTime();
	//----------------------------------------------------------------------------------------------------------	
	//----------------------------------------------------------------------------------------------------------	
	//Manipulating Dates and Times
	//Easy - date and time classes are immutable
	LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
	System.out.println(date);		//2014-01-20
	date = date.plusDays(2);
	System.out.println(date);		//2014-01-22
	date = date.plusWeeks(1);
	System.out.println(date);		//2014-01-29
	date = date.plusMonths(1);		//As Java sees that 2014-02-29 doesn't exist, the method give us 2014-02-28
	System.out.println(date);		//2014-01-28
	date = date.plusYears(5);
	System.out.println(date);
	
	
	LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
	LocalTime time4 = LocalTime.of(5, 15);
	LocalDateTime dateTime = LocalDateTime.of(date, time4);
	System.out.println(dateTime);	//2020-01-20T05:15
	dateTime = dateTime.minusDays(1);
	System.out.println(dateTime);	//2020-01-19T05:15
	dateTime = dateTime.minusHours(10);
	System.out.println(dateTime);	//2020-01-18T19:15	
	dateTime = dateTime.minusSeconds(30);
	System.out.println(dateTime);	//2020-01-18T19:14:30
	//Chaning LalDate methods
	LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
	LocalTime time5 = LocalTime.of(5, 15);
	LocalDateTime dateTime3 = LocalDateTime.of(date4, time5).minusDays(1).minusHours(10).minusSeconds(30);
	//tricking you
	LocalDate date5 = LocalDate.of(20120, Month.JANUARY, 20);
	date.plusDays(10);
	System.out.println(date);	//2020-01-20 - We ignored the result of adding 10 days.
	//tricking you
	//date.plusMinutes(1);		DOESN'T COMPILE
	//----------------------------------------------------------------------------------------------------------	
	//----------------------------------------------------------------------------------------------------------			
	//WORKING WITH PERIODS
	LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
	LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
	Period period= Period.ofMonths(1);
	//performAnimalEnrichment
	LocalDate upTo = start;
	while(end.isBefore(start)){	//check is still before end
		System.out.println("give new toy: " + upTo);
		//upTo = upTo.plusMonths(1);				//add a month		
		upTo = upTo.plus(period);				//add a month		
	}
	
	//LocalDate.toEpochDay() - returns the number of days since 01-01-1970 in GMT(Greenwich Mean Time).
	//LocalDateTime.toEpochSecond() - returns the number of seconds since 01-01-1970 in GMT(Greenwich Mean Time).
	//LocalTime doesn't have a ".toEpochSecond()".
	Period annually = Period.ofYears(1);
	Period quarterly = Period.ofMonths(3);
	Period everyThreeWeeks = Period.ofWeeks(1);
	Period everyOtherDay = Period.ofDays(1);
	Period everyYearAndWeek = Period.of(1, 0, 7);	//One Year and 7 Days.
	//The following code give us a warning
	Period wrong = Period.ofYears(1);
	wrong = Period.ofWeeks(1);
	//Try also Duration - Has the same methods as Period but doesn't come into the Exam.
	//Period is not used in LocalTime
	LocalTime time = LocalTime.of(6, 15);
	Period period2 = Period.ofMonths(1);
	Duration duration = Duration.millis(1000);
	//time.plus(period2);	//UnsupportedTemporalTypeException
	
	//FORMATING DATES AND TIMES
	date = LocalDate.of(2020, Month.JANUARY, 20);
	System.out.println(date.getDayOfWeek());	//MONDAY
	System.out.println(date.getMonth());		//JANUARY	
	System.out.println(date.getYear());			//2020
	System.out.println(date.getDayOfYear());	//20
	
	//import java.time.format;
	time = LocalTime.of(11, 12, 34);
	dateTime = LocalDateTime.of(date, time);
	System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));			//2020-01-20
	
	System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));			//11:12:34
	System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));	//2020-01-20T11:12:34
	
	System.out.println("************ SHORT *******************");
	DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	System.out.println(shortDateTime.format(dateTime));	// 1/20/20
	System.out.println(shortDateTime.format(date));		// 1/20/20
	//System.out.println(shortDateTime.format(time));		 //UnsupportedTemporalTypeException - The time cannot formated as a date.
	//System.out.println(time.format(shortDateTime));		 //UnsupportedTemporalTypeException - The time cannot formated as a date.		
	
	//ofLocalized methods
	date = LocalDate.of(2020, Month.JANUARY, 20);
	LocalTime time6 = LocalTime.of(11, 12, 34);
	LocalDateTime dateTime4 = LocalDateTime.of(date, time6);
	
	DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	System.out.println(shortF.format(dateTime));	// 1/20/20 11:12 AM	
	System.out.println(mediumF.format(dateTime));	// Jan 20, 2020 11:12:34 AM
	
	//Your Own Format	//M - outputs: 1; MM: 01, MMM: Jan; MMMM: January //dd; yyyy; hh; : ; mm
	DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd yyyy, hh:mm" );
	System.out.println(dateTime.format(f));	// Jan 20, 2020 11:12
	
	//NEW WAY
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");			//OLD WAY
	LocalDateTime dt = LocalDateTime.of(2020, Month.JANUARY, 20, 11, 12, 34);	//SimpleDateFormat sf = new SimpleDateFormat("hh:mm"); sf.format(jan3);	
	dt.format(formatter);
	
	//PARSING DATES&TIMES
	DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
	LocalDate date6 = LocalDate.parse("01 02 2015", f2);
	LocalTime time7 = LocalTime.parse("11:22");
	
  }
}