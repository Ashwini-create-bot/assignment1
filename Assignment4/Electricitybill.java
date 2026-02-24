import java.util.Scanner;
public class Electricitybill{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your consumed units: ");
		int units = sc.nextInt();
		double bill = units*1.5;
		System.out.println("Your bill is: Rs."+bill);
	}
}