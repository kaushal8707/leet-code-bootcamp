package arrays.codes;

public class BinarySearch {

	public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int key=2;
        int flag=0;
        int min=0,max=arr.length-1;
        while(min<=max) {
        	int mid=min+(max-min)/2;
        	if(arr[mid]==key) {
        		System.out.println(key+" found at Position "+(mid+1));
        		flag=1;
        		break;
        	}else if(arr[mid]<key) {
        		min=(mid+1);
        	}else {
        		max=mid-1;
        	}
        }
        if(flag==0) {
        	System.out.println(key+" Not found in an array");
        }
        

	}

}
