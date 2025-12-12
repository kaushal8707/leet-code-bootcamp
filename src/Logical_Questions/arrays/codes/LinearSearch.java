package arrays.codes;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {5,2,9,3,6,4,1,8,7};
		int key=4;
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				flag=1;
				System.out.println(key+"  found at position "+(i+1));
			}
		}
		if(flag==0) {
			System.out.println(key+" Not found in array");
		}
	}

}
