package flowcontrolstatements;

import java.util.Scanner;

public class IfElseNotGoodChoice {

	public static void main(String[] args) {

		// req user will enter date as int,mon as int,year as int
		// o/p: e.g date as 2 month as 10 year as 1990
		// expected 02-Oct-1990

		System.out.println("Enter your Date of birth");
		System.out.println("Enter date ");
		Scanner input1 = new Scanner(System.in);
		int date = input1.nextInt();

		System.out.println("Enter month ");
		Scanner input2 = new Scanner(System.in);
		int mon = input2.nextInt();

		System.out.println("Enter year ");
		Scanner input3 = new Scanner(System.in);
		int year = input3.nextInt();

		System.out.format("%02d-%02d-%04d", date, mon, year);

		String month = null;

		if (mon == 1) {
			month = "Jan";
		} else if (mon == 2) {
			month = "Feb";
		} else if (mon == 3) {
			month = "Mar";
		} else if (mon == 4) {
			month = "Apr";
		} else if (mon == 5) {
			month = "May";
		} else if (mon == 6) {
			month = "Jun";
		} else if (mon == 7) {
			month = "Jul";
		} else if (mon == 8) {
			month = "Aug";
		} else if (mon == 9) {
			month = "Sep";
		} else if (mon == 10) {
			month = "Oct";
		} else if (mon == 11) {
			month = "Nov";
		} else if (mon == 12) {
			month = "Dec";
		}
		else
		{
			System.out.println("entered month is invalid....");
		}
		System.out.println();
		System.out.format("%02d-%s-%04d", date, month, year);
	}

}
