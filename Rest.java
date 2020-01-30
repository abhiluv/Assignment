import java.util.Scanner;

class MyException extends Exception{
	public MyException(String msg){
		super(msg);
		System.out.println("My Custom Exception");
	}	
}
class Student{
	int age;
	void SetAge(int age){
		try{
		if(age<0){
			throw new MyException("invalid age");
		}
		}
		catch(MyException ex){
			System.out.println(ex);
		}
	}
} 

public class Rest{
	public static void main(String args[]){
	 Scanner sc= new Scanner(System.in);
     System.out.print("Enter age: ");
    	int number = sc.nextInt();
		Student st=new Student();
		st.SetAge(number);
	}
}	
	
	
