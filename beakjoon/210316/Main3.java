import java.util.Calendar;
public class Main3{
	public static void main(String args[]){ 

		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
	}
}
