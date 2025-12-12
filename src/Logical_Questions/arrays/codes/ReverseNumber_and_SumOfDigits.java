package arrays.codes;

public class ReverseNumber_and_SumOfDigits {

	public static void main(String[] args) {
		int number=93765;
		int result = findSumOfDigits(number);
		int reverseNumber = findReverseOfANumber(number);
		System.out.println("Sum of Digits in "+number+"   =  "+result);
		System.out.println("Reverse of "+number+"   =  "+reverseNumber);

	}

	private static int findReverseOfANumber(int number) {
		int rev=0;
		while(number!=0) {
			int rem=number%10;
			rev=rev*10+rem;
			number/=10;
		}
		return rev;
	}

	private static int findSumOfDigits(int number) {
		int sum=0;
		while(number!=0) {
			int rem=number%10;
			sum+=rem;
			number/=10;
		}
		return sum;
	}

}
