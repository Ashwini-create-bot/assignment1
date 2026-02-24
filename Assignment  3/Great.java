import java.util.Scanner;
public class Great{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b){
			System.out.println("a is graeter");
		}else{
			System.out.println("b is graeter");
		}
	}
}