public class Npattern{
	public static void main(String[] arg){
		for(int line=1;line<=7;line++){
			for(int ast=1;ast<=7;ast++){
				if(ast==1 || ast==line || ast==7){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}