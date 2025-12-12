package strings.codes;

// creating another array to store the reverse string data
// original string value reading from end and storing into new array
// then printing new array

public class ReversingString_1
{
	public static void main(String[] args) 
	{
		String word="python";
		char A[]=new char[word.length()]; 
		for(int i=word.length()-1,j=0;j<word.length();i--,j++) {
			A[j]=word.charAt(i);
			if(j<0)
				break;
		}
		System.out.println(A);
	}
}
