import java.util.Scanner;
public class Num8{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int num=sc.nextInt();
		if(num==25){
			System.out.println(+num+" is equal to 25");
		}else{
			System.out.println(+num+" is not equal to 25");
		}
	}
}