import java.util.Scanner;
public class Scholarship{
	public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your percentage:");
    float per = sc.nextFloat();
    if(per>=80)
		System.out.println("you are eligible for scholarship");
	else
		System.out.println("you are not eligible for scholarship");
	}
}