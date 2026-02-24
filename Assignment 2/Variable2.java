public class Variable2{
	 public static void main(String[] arg){
		 //using third variable
		 int a=10;
		 int b=20;
		 int c;
		 c=a;
		 a=b;
		 b=c;
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 //without using third variable
		  int x=10;
		 int y=20;
		 x=x+y;
		 y=x-y;
		 x=y+y;
		 System.out.println("x="+x);
		 System.out.println("y="+y);
		 
	 }
}
		 

	