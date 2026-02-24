import java.util.Scanner;
	public class Uppercase{
		public static void main(String[] arg){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a character :");
			char ch = sc.next().charAt(0);
			if(ch >='A' && ch<='Z' )
				System.out.println("It is Uppercase Character ");
			else
				System.out.println("It is not Uppercase Character  ");
		}
	}