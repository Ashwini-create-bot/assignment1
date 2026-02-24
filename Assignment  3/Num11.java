import java.util.Scanner;
public class Num11{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if(num>=1 && num<=100){
			System.out.println(+num+" is between 1 and 100");
		}else{
			System.out.println(+num+" is not between 1 and 100");
		}
	}
}
