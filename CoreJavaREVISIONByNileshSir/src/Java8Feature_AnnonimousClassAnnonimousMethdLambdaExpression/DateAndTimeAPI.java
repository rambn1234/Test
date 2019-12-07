package Java8Feature_AnnonimousClassAnnonimousMethdLambdaExpression;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeAPI {

	
	public static void main(String[] args) {
		
		
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		
		
		
		System.out.println(" Default time of system="+time);
		System.out.println("Our Own time Format dd-mm-yyy");
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy= date.getYear();
		
		System.out.printf("%d-%d-%d",+dd,mm,yyyy);
		
		
		
	}
	
}
