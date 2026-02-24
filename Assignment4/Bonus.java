import java.util.Scanner;
public class Bonus{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary:");
		float salary = sc.nextFloat();
		float bonus = 0f;
		if(salary<=30000)
			bonus = salary*(20/100f);
		else
			bonus = salary*(30/100f);
		float totalsalary=(salary+bonus);
		System.out.println("your bonus is :"+bonus);
		System.out.println("your Total salary is :"+totalsalary);
	}
}
		