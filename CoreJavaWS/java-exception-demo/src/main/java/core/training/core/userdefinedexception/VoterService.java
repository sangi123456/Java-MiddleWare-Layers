package core.training.core.userdefinedexception;

import com.training.core.checked.Person;

public class VoterService {

	public static boolean validateAge(Person p) throws NegativeAgeException {
		
		if(p.getAge() < 0) {
			throw new NegativeAgeException("Age Cannot be Negative");
			//create an object of exception class
		}
		else  if(p.getAge() >= 18) 
		{
			return true;
		}
		return false;
	}
	
	
	
}
