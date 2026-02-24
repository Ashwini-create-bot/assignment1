import java.util.Scanner;
public class Specialchar{
	public static void main(String[] arg){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch= sc.next().charAt();
		if(ch=='@'|| ch=='#'|| ch=='$'|| ch=='%'|| ch=='*'){
			System.out.println("It is a special character.");
		}else{
			System.out.println("It is not a special character.");
		}
	}
}
		