package core.training.core.userdefinedexception;

import com.training.core.checked.Person;

public class TestVoters {
	
   public static void main(String[] args) {
	
	Person p = new Person(1, "sangita", 21);
	try {
		boolean result = VoterService.validateAge(p);
	   System.out.println("result = " + result);
	  }catch (NegativeAgeException e) {
		e.printStackTrace();
	}
	
	Person p1 =  new Person(2, "sakshi", 22);
	try {
		boolean result = VoterService.validateAge(p1);
	   System.out.println("result = " + result);
	}catch(NegativeAgeException e) {
		e.printStackTrace();
	}
	Person p2 =  new Person(3, "vaishu", 23);
	try {
		boolean result = VoterService.validateAge(p2);
	   System.out.println("result = " + result);
	}catch(NegativeAgeException e) {
		e.printStackTrace();
	}
	
	Person p3 =  new Person(4, "ganu", 24);
	try {
		boolean result = VoterService.validateAge(p3);
	   System.out.println("result = " + result);
	}catch(NegativeAgeException e) {
		e.printStackTrace();
	}
}
}
