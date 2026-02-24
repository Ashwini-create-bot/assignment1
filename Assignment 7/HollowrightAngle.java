public class HollowRightAngle{
	public static void main(String[] arg){
		for(int line=1;line<=5;line++){
			if(line==1 || line==5){
				for(int ast=1;ast<=line;ast++){
					System.out.print("* ");
				}
			}else{
				for(int ast=1;ast<=line;ast++){
				   if(ast==1 || ast==line){
					System.out.print("* ");
				   }else{
					   System.out.print("  ");
				   }
				}
			}
			System.out.println();
		}
	}
}
				
					
				
				
		
			 
		
	

				