package arrays.codes;

public class PrintPrimeNumberBetween_1To50 {

	public static void main(String[] args) {
		for(int i=2;i<=50;i++) {
			boolean flag=false;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=true;
				}
			}
			if(!flag) {
				System.out.print(i+" ");
			}
		}
		

	}

}
