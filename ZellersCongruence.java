import java.util.Scanner;
import java.util.*;
public class ZellersCongruence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String date, month, day, year;
		double DayOfWeek=0;
		int centyear;
		double zbcentyear;

		System.out.println("Please enter date (format: mmddyyyy)");
		date = scan.next();

		month = date.substring(0,2);
		day = date.substring(2,4);
		year = date.substring(4,8);


		int q = Integer.parseInt(day);
		int m = Integer.parseInt(month);
		int y = Integer.parseInt(year);

		if(date.length()!=8){
			System.out.println("Enter a valid date");
		}
		else{


			if(m == 01){
				m = 13;
				y -= 1;
				centyear = y%100;
				zbcentyear = Math.floor(y/100);
				DayOfWeek = (q + Math.floor(13*(m+1)/5) + centyear + Math.floor(centyear/4)+Math.floor(zbcentyear/4)-2*(zbcentyear))%7;
			}
			else if (m==02){
				m = 14;
				y -= 1;
				centyear = y%100;
				zbcentyear = Math.floor(y/100);
				DayOfWeek = (q + Math.floor(13*(m+1)/5) + centyear + Math.floor(centyear/4)+Math.floor(zbcentyear/4)-2*(zbcentyear))%7;
			}
			else{
				centyear = y%100;
				zbcentyear = Math.floor(y/100);
				DayOfWeek = (q + Math.floor(13*(m+1)/5) + centyear + Math.floor(centyear/4)+Math.floor(zbcentyear/4)-2*(zbcentyear))%7;

			}

			if(DayOfWeek == 0){
				System.out.println("The value of the date is: " + DayOfWeek + " ,which is a Saturday");
			}
			else if (DayOfWeek == 1){
				System.out.println("The value of the date is: " + DayOfWeek + " ,which is a Sunday");
			}
			else if (DayOfWeek == 2){
				System.out.println("The value of the date is: " + DayOfWeek + " ,which is a Monday");
			}
			else if (DayOfWeek == 3){
				System.out.println("The value of the date is: " + DayOfWeek + " ,which is a Tuesday");
			}
			else if (DayOfWeek == 4){
				System.out.println("The value of the date is: " + DayOfWeek + " ,which is a Wednesday");
			}
			else if (DayOfWeek == 5){
				System.out.println("The value of the date is: " + DayOfWeek + " ,which is a Thursday");
			}
			else if (DayOfWeek == 6){
				System.out.println("The value of the date is: " + DayOfWeek + " ,which is a Friday");
			}
		}

	}
	


}
