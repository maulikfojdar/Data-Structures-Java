package sorting;

public class BubbleSort {

	public static void main(String[] args){
		int[] a = {2,4,6,1,-1,5,7,-3};
		int i, j;
		for(i = a.length; i > 0; i--){
			for(j = 0 ; j < i-1; j++){
				int k = j+1;
				if(a[j] > a[k]){
					int temp;
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
				
			}
			for(int l = 0 ; l < a.length; l++){
				System.out.print(a[l]+ " ");
			}
			System.out.println("");
		}
		
	}

}
