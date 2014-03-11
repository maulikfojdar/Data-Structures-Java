package sorting;

public class SelectionSort {
	
	public static void main(String[] args){
		
	int[] a = {7,4,3,7,8,3,2,45,23,20};
		
		for(int i = 0; i < a.length - 1; i++){
			int index = i;
			for (int j = i + 1; j < a.length ; j++){
				if (a[j] < a[index]){
					index = j;
				}
			}	
				int mint = a[index];
				a[index] = a[i];
				a[i] = mint;
			
			
		}
		for(int k = 0 ; k <a.length ; k++){
			System.out.print(a[k]+ " ");
		}
	}
	
}
