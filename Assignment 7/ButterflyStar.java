public class ButterflyStar{
	public static void main(String[] arg){
		for (int line = 1; line <=8; line++) {
			if(line<=4){
				for(int ast = 1; ast <=line; ast++) {
				    System.out.print("*");
				}
				for(int space = 1; space<=2*(4-line); space++) {
				    System.out.print(" ");
				}
				for(int ast = 1; ast <=line; ast++) {
				    System.out.print("*");
				}
			}else{
				for(int ast=1;ast<=8-line;ast++){
					System.out.print("*");
				}
				for(int space=1;space<=2*(line-4);space++){
					System.out.print(" ");
				}
				for(int ast=1; ast<=8-line; ast++) {
				    System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
