package Ass2;

public class StudentDetails 
{
	public static void main(String[] args) {
		
	}
	int studentID;
	String studentName;
	int studentAge;
	int marks1;
	int marks2;
	int marks3;

	StudentDetails(int id,String name,int age,int m1,int m2,int m3)
	{
	studentID=id;
	studentName=name;
	studentAge=age;
	marks1=m1;
	marks2=m2;
	marks3=m3;

	}

	void displayResult()
	{

	int total=marks1+marks2+marks3;
	double percentage=total/3;
	System.out.println("Student Id:"+studentID + "\t" +"Student Name:"+ studentName + "\t" + "Age"+studentAge);
	System.out.println("Total:"+total+"\t"+"percentage:"+percentage);


	if (percentage >= 50) 
	{
	   System.out.println("PASS");
	} else 
	{
	   System.out.println("FAIL");
	}
	}
}
	
	
	

