import java.util.Scanner;
	public class Lowercase{
		public static void main(String[] arg){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a character :");
			char ch = sc.next().charAt(0);
			if(ch >='a' && ch<='z' )
				System.out.println("It is Lowercase Character ");
			else
			System.out.println("It is not Lowercase Character  ");
		}
	}