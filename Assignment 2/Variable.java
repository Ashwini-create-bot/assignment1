public class Variable{
	int i=35;//instance variable
	static byte b=10;//static variable
	public static void main(String[] arg){
		int x=90;//local variable
		Variable t1 = new Variable();
		System.out.println(t1.i);
		System.out.println(b);
		System.out.println(x);
	}
}