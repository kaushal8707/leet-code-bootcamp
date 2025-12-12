package strings.codes;

//when more than 1 space will occurs consecutively(one after another) in a sentence.

public class CountingWordsInString_2ndCase {

	public static void main(String[] args) {
		String sentence="How are   u kaushal  singh";
		char A[]=sentence.toCharArray();
		int sCount=0;			//space count so 1 space means 2 word, 2 space means 3 words
		
		for(int i=0;i<A.length;i++) {
			
			if(A[i]==' ' && (A[i]!= A[i-1])){
				sCount++;
			}
		}
		System.out.println("No. of words present "+(sCount+1));
	}
}
