import java.util.Scanner;
public class Num2{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		if(num%5==0){
			System.out.println("Given number is divisible by 5");
		}else{
			System.out.println("Given number is not divisible by 5");
		}
	}
}