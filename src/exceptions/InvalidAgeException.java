package exceptions;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException()
	{
		super("Invalid age ..please visit this website once you are 18..");
	}

}
