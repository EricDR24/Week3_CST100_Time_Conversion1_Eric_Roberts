/*Program: Time Conversion 1
 * File: timeConversion1
 * Summary: program will convert 24hr format to 12hr format
 *Author: Eric Roberts
 *Date: July 10, 2016
 */
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class timeConversion1 {

	public static void main(String[] args) {
		//create scanner for user input for time
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour in the 24 format: Example 08:00 or 15:25: ");
		String hour = sc.nextLine();
	
try
		{
			SimpleDateFormat _24 = new SimpleDateFormat("HH:mm");
			SimpleDateFormat _12 = new SimpleDateFormat("hh:mm a");
			Date _24time = _24.parse(hour);
			System.out.println(_12.format(_24time));
	
		}
catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
