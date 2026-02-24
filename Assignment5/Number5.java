import java.util.Scanner;
public class Number5{
	public static void main(String[] arg){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if(num%4==0 && num%6==0){
			System.out.println(+num+" is divisible by 4 and 6");
		}else if(num%4==0 && num%6!=0){
			System.out.println(+num+" is divisible by 4 but not divisible by 6");
		}else if(num%6==0 && num%4!=0){
			System.out.println(+num+" is divisible by 6 but not divisible by 4");
		}else{
			System.out.println(+num+" is not divisible by 4 and 6");
		}
	}
}
	