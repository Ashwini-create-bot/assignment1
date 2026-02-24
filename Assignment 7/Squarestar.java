import java.util.Scanner;
public class Squarestar{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int line=1;line<=num;line++){
			for(int ast=1;ast<=num;ast++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
		
	