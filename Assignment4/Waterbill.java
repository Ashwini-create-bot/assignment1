import java.util.Scanner;
public class Waterbill{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter consumed water(in liters): ");
		int water = sc.nextInt();
		double waterbill=0;
		if(water<=100)
			waterbill=water *1.5;
		else 
			waterbill=100*1.5+(water-100) *2.5; 
		System.out.println("Your water bill is :Rs."+waterbill);
	}
}