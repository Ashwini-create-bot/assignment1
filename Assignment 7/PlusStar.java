public class PlusStar{
	public static void main(String[] arg){
		for(int line=1;line<=5;line++){
			if(line!=3){
				for(int space=1;space<=5;space++){
					if(space==3){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
			}else{
				for(int ast=1;ast<=5;ast++){
					System.out.print("* ");
				}
			}
			System.out.println(); 
		}
	}
}