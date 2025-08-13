package flowcontrolstatements;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {

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

		// int/byte/short/char/String
		switch (mon) {
		case 1:
			month = "Jan";
			break;

		case 2:
			month = "Feb";
			break;
		case 3:
			month = "Mar";
			break;

		case 4:
			month = "Apr";
			break;
		case 5:
			month = "May";
			break;

		case 6:
			month = "Jun";
			break;
		case 7:
			month = "Jul";
			break;

		case 8:
			month = "Aug";
			break;
		case 9:
			month = "Sep";
			break;

		case 10:
			month = "Oct";
			break;
		case 11:
			month = "Nov";
			break;

		case 12:
			month = "Dec";
			break;
		default:
			System.out.println("enter valid month..");

		}
		
		System.out.println();
		System.out.format("%02d-%s-%04d", date, month, year);

	}

}
