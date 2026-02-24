import java.util.Scanner;
public class Number1{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three numbers : ");
		int num1  = sc.nextInt();
		int num2  = sc.nextInt();
		int num3  = sc.nextInt();
		if(num1==num2 && num2==num3 && num3==num1)
			System.out.println(+num1+","+num2+" and "+num3+" is a equal");
		else
			System.out.println(+num1+","+num2+" and "+num3+" is not equal");
	}
}