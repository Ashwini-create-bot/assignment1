import java.util.Scanner;
public class Num6{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int num=sc.nextInt();
		if(num>100){
			System.out.println(+num+" is grater than 100");
		}else{
			System.out.println(+num+" is not grater than 100");
		}
	}
}