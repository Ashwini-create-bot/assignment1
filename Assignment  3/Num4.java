import java.util.Scanner;
public class Num4{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		if(num%3==0){
			System.out.println(+num+" is multiple of 3");
		}else{
			System.out.println(+num+" is not multiple of 3");
		}
	}
}