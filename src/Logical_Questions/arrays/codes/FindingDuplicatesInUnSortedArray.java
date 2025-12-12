package arrays.codes;
// first we need to check arr[i]==arr[i+1]
// then we need to count duplicate element and made that duplicate element as -1
// then in last we need to add the condition if arr[i]!=-1

public class FindingDuplicatesInUnSortedArray {

	public static void main(String[] args) {
		int arr[]= {8,3,6,4,6,5,6,8,2,7};
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			
			if(arr[i]!=-1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=-1;
					}
				}
			}
			if(count>1) {
				System.out.println(arr[i]+"  comes at times "+count);
			}
		}
	}
}
