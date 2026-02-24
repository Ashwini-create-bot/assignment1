public class FullDiamond{
	public static void main(String[] arg){
		for(int line=1;line<=10;line++){
			if(line<=5){
				for(int space=1;space<=5-line;space++){
					System.out.print(" ");
				}
				for(int ast=1;ast<=line;ast++){
					System.out.print("* ");
				}
			}else{
				for(int space=1;space<=line-5;space++){
					System.out.print(" ");
				}
				for(int ast=1;ast<=10-line;ast++){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}