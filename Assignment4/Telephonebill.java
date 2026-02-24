import java.util.Scanner;
public class Telephonebill{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers of calls : ");
		int calls = sc.nextInt();
		float bill = calls*0.5f;
		System.out.println("Your telephone bill is :Rs."+bill);
	}
}
		