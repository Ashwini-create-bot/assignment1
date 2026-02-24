import java.util.Scanner;
public class Num5{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		if(num%10==0){
			System.out.println(+num+" is multiple of 10");
		}else{
			System.out.println(+num+" is not multiple of 10");
		}
	}
}