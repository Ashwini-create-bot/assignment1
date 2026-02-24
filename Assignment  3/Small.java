import java.util.Scanner;
public class Small{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<b){
			System.out.println("a is smaller");
		}else{
			System.out.println("b is smaller");
		}
	}
}