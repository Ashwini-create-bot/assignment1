import java.util.Scanner;
public class Number3{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if(num!=0){
		if(num<0 && num%2!=0)
			System.out.println(+num+" is a negative and odd");
		else if(num<0 && num%2==0)
			System.out.println(+num+" is a negative but not odd");
		else if(num>0 && num%2!=0)
			System.out.println(+num+" is a not negative but odd");
		else
			System.out.println(+num+" is a not negative not odd");
		}else
			System.out.println(+num+" is a neutral");
	}
}