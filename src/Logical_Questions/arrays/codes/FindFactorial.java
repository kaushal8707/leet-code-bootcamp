package arrays.codes;

public class FindFactorial {

	public static void main(String[] args) {
		int num=4;
		int result = findFactorial(num);
		System.out.println(result);
	}

	private static int findFactorial(int num) {
		int factorial=1;
		int i=0;
		while(num>0) {
			factorial=factorial*num;
			num--;
		}
		return factorial;
	}

}
