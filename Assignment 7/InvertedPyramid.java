public class InvertedPyramid{
	public static void main(String[] arg){
		for(int line=5;line>=1;line--){
			for(int space=1;space<=5-line;space++){
				System.out.print(" ");
			}
			for(int ast=1;ast<=line;ast++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
			