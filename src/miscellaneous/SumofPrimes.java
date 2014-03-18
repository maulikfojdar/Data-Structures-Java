package miscellaneous;

public class SumofPrimes {
	
	public static void main(String[] args){
		
		int count = 0;
		int sum = 0;
		for (int i = 2 ; count < 1000 ; i++){
			if (isPrime(i)){
				sum = sum + i;
				count++;
				//System.out.println(sum);
			}
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int number) {
		
		for (int i = 2; i <= number/2; i++ ){
			if(number % i == 0){
				return false;
			}
		}
		return true;
		
	}
		
	

}
