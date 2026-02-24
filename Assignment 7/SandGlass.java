public class Sandglass{
	public static void main(String[] arg){
		for(int line=1;line<=9;line++){
			if(line<=5){
				for(int space=1;space<line;space++){
					System.out.print(" ");
                }
				for(int ast=5;ast>=line;ast--){
					System.out.print("* ");
				}
			}else{
				for(int space=9;space>line;space--){
					System.out.print(" ");
				}
				for(int ast=1;ast<=line-4;ast++){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
					