import java.util.Scanner;
public class Num1{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		if(num==0){
			System.out.println("Given number is Zero");
		}else{
			System.out.println("Given number is not Zero");
		}
	}
}