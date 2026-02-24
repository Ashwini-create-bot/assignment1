import java.util.Scanner;
public class Number2{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if(num!=0){
		if(num>0 && num%2==0)
			System.out.println(+num+" is a positive and even");
		else if(num>0 && num%2!=0)
			System.out.println(+num+" is a positive but not even");
		else if(num<0 && num%2==0)
			System.out.println(+num+" is a not positive but even");
		else
			System.out.println(+num+" is a not positive not even");
		}else
			System.out.println(+num+" is a neutral");
	}
}