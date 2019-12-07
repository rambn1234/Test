package ConstructorSynarious;

public class CostructorChaining {

	int empId;
	String empName;
	CostructorChaining()
	{
		this(1);
	}
	
	
	CostructorChaining(int empId)
	{
		this(empId,"Ram");
		
	}
	
	CostructorChaining(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	public static void main(String[] args) {
		CostructorChaining obj=new CostructorChaining();
		
		System.out.println(obj.empId);
		System.out.println(obj.empName);
	}
	
}
