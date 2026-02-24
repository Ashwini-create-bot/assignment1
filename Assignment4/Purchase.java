import java.util.Scanner;
public class Purchase{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Purchase amount:");
		float puramount = sc.nextFloat();
		float discount = 0f;
		if(puramount<=30000)
			discount = puramount*(10/100f);
		else
			discount = puramount*(20/100f);
		float amount = (puramount-discount);
		System.out.println("your Total Purchase amount is :Rs."+puramount);
		System.out.println("your discount is :Rs"+discount);
		System.out.println("After applying discount on your Purchase amount is :Rs"+amount);
	}
}
