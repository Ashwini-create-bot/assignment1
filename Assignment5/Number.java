import java.util.Scanner;
public class Number{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two numbers : ");
		int num1  = sc.nextInt();
		int num2  = sc.nextInt();
		if(num1==num2)
			System.out.println(+num1+" and "+num2+" is a equal");
		else
			System.out.println(+num1+" and "+num2+" is not equal");
	}
}