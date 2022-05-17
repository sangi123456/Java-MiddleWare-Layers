package core.training.core.userdefinedexception;

//create a custom checked exception class

public class NegativeAgeException extends Exception{

	
	public NegativeAgeException(String message) {
		super(message);
	}
}
