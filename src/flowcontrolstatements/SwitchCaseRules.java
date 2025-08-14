package flowcontrolstatements;

public class SwitchCaseRules {

	public static void main(String[] args) {

		
		String a = "abc";
		//a can be int/byte/short/char/String
		//Cannot switch on a value of type long/float/double/boolean
		switch (a) {
		case "xyz":
			System.out.println("a is 10");

			break;

		case "abc":
			System.out.println("a is 20");
			break;

		default:
			break;
		}
	}

}
