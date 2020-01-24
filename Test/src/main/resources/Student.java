
public class Student {
	
	public RollNumber;
	public Name;
	public TeacherName;
	public Grade ;
	
}

public int getRollNo(){
	return RollNo;
}

public void setRollNo(int rollno){
	this.rollNo=rollno ;
}
public string setName(string Name) {
	this.Name=Name;
}
public string setTeacherName(string TeacherName) {
	this.TeacherName=TeacherName;
}

public int getgrade(){
	return grade;
}

public void setgradeo(int grade){
	this.grade=grade ;
}

//static variable & static method//


class Test 
{
	public static void main ( string  [] args )
	{
		public static int i; //static declaration of variable//
		public int k; //non static declaration of variable//
		
	}
}
	


// Write a Singleton Class//

public class Singleton{
	private static singleton obj;
	static {
		obj = new Singleton();
		
	}
	private Singleton(){
}
	public static Singleton getInstance (){
		return obj;
	}
	System.out.println("it is working") ;
}
	}