package histogram;

public class CharArrayHistogram {
	
	public static void main(String[] args){
		
		char[] charArray = {'a','z','c','c','b','c','b',};
		int[] cnt = new int[256];
		
		for (int i = 0; i < charArray.length; i++) {
			cnt[(int)charArray[i]]++;
		}
		for (int i = 0; i < cnt.length; i++) {
			if(cnt[i]>=1)
				System.out.println((char)i+" "+i+" "+cnt[i]);
		}		
	}
}