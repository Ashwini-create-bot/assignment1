import java.util.Scanner;
public class Area{
	public static void main(String[] arg){
		int radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius:");
	    radius = sc.nextInt();
		double area = 3.14*radius*radius;
		System.out.println("Area of circle is:"+area);
	}
}