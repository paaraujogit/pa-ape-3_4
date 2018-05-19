package david.exames.exame1;

import java.time.Month;

//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.Month;
//import java.time.LocalDateTime;
//import java.time.ZonedDateTime;
//import java.time.OffsetTime;



public class _24 {

	public static void main(String[] args) {

		 java.time.LocalDate d1 = java.time.LocalDate.of(2015, Month.JANUARY, 31);  
		 java.time.LocalDateTime d2 = java.time.LocalDateTime.of(2015, Month.JANUARY, 31, 10, 56);  
		 java.time.LocalDateTime d3 = java.time.LocalDateTime.parse("2015-01-02T17:13:50"); //Note that this will throw a  java.time.format.DateTimeParseException if the input string lacks the time component i.e.T17:13:50  
		 java.time.LocalDate d4 = java.time.LocalDate.parse("2015-01-02"); //Note that this will throw a  java.time.format.DateTimeParseException if the input string contains the time component  
		 java.time.LocalTime d5 = java.time.LocalTime.parse("02:13:59.985"); //Note that this will throw a  java.time.format.DateTimeParseException if the input string contains the Date component
	}

}
