import java.util.Scanner;
public class Student{
public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a mathematics marks: ");
	int math = sc.nextInt();
	System.out.println("Enter a Science marks: ");
	int sci = sc.nextInt();
	System.out.println("Enter a History marks: ");
	int hist = sc.nextInt();
	System.out.println("Enter a Marathi marks: ");
	int mar = sc.nextInt();
	System.out.println("Enter a Geography marks: ");
	int geo = sc.nextInt();
	int total=math+sci+hist+mar+geo;
	float percentage =(total/500f)*100;
	System.out.println("Total="+total);
	System.out.println("Percentage="+percentage);
	
	if(percentage>=90)
		System.out.println("Grade=A+");
	else if(percentage>=80)
		System.out.println("Grade=B+");
	else if(percentage>=70)
        System.out.println("Grade=C+");
	else
		System.out.println("Grade=D+");
	
	
    }
  }
	
	
	