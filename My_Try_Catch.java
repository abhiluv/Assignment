public class My_Try_Catch {
		   public static void main(String args[]) {
		      int num1, num2;
		      try {
		         num1 = 0;
		         num2 = 62 / num1;
		         System.out.println(num2);
		         System.out.println("try block");
		      }
		      catch (ArithmeticException e) { 
		         System.out.println("You should not divide a number by zero");
		      }
		      System.out.println("I'm out of try-catch block in Java.");
		   }
	}

