import java.util.Scanner;
public class Number4{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if(num%2==0 && num%3==0 && num%5==0){
			System.out.println(+num+" is divisible by 2,3 and 5");
		}else if(num%2==0 && num%3==0 && num%5!=0){
			System.out.println(+num+" is divisible by 2 and 3 but not divisible by 5");
		}else if(num%3==0 && num%5==0 && num%2!=0){
			System.out.println(+num+" is divisible by 3 and 5 but not divisible by 2");
		}else if(num%2==0 && num%5==0 && num%3!=0){
			System.out.println(+num+" is divisible by 2 and 5 but not divisible by 3");
		}else{
			System.out.println(+num+" is not divisible by 2,3 and 5");
		}
	}
}
			