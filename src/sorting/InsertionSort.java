package sorting;

public class InsertionSort {
	
	public static void main(String[] args){
		
		int[] a = {23,5,26,3,6,7,2,4,21};
		int n = a.length;
		int key,i,j;
		for(j = 1; j < n; j++){
			
			key = a[j];
			System.out.println("Key is "+key);
			for(i = j-1; i > -1 && key < a[i]; i--){
					a[i+1] = a[i];
					a[i] = key;
			}
			
			for(int k = 0; k < a.length; k++){
				System.out.print(a[k]+" ");
				}
			System.out.println("");
		}
	}
}
/*
Output :

Key is 5
5 23 26 3 6 7 2 4 21 
Key is 26
5 23 26 3 6 7 2 4 21 
Key is 3
3 5 23 26 6 7 2 4 21 
Key is 6
3 5 6 23 26 7 2 4 21 
Key is 7
3 5 6 7 23 26 2 4 21 
Key is 2
2 3 5 6 7 23 26 4 21 
Key is 4
2 3 4 5 6 7 23 26 21 
Key is 21
2 3 4 5 6 7 21 23 26 

*/