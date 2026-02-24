import java.util.Scanner;
public class Num7{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int num=sc.nextInt();
		if(num<50){
			System.out.println(+num+" is less than 50");
		}else{
			System.out.println(+num+" is not less than 50");
		}
	}
}