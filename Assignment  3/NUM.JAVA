import java.util.Scanner;
public class Num{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println("Given number is Even");
		}else{
			System.out.println("Given number is Odd");
		}
	}
}