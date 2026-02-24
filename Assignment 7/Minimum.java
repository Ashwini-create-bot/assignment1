public class Minimum{
	public static void main(String[] arg){
		int[] arr={12,34,2,33,5};
		int firstmin=arr[0];
		int secmin=arr[0];
		for(i=1;i<arr.length;i++){
			if(arr[i]<firstmin){
				firstmin=arr[i];
			}
		}
		for(int i=1;i<arr.length;i++){
			if(arr[i]<secmin && arr[i]>firstmin){
				secmin=arr[i];
			}
		}
		System.out.println(secmin);
	}
}