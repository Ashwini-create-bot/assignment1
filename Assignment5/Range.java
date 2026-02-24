import java.util.Scanner;
public class Range{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		if(num>=1 && num<=100)
			System.out.println(+num+" is lies in 1 to 100");
		else
			System.out.println(+num+" is not lies in 1 to 100");
	}
}
		
		