import java.util.Scanner;
public class Num9{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int num=sc.nextInt();
		if(num%2==0 & num%3==0){
			System.out.println(+num+" is divisible by 2 and 3");
		}else{
			System.out.println(+num+" is not divisible by 2 and 3");
		}
	}
}