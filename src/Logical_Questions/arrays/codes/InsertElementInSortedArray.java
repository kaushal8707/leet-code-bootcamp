package arrays.codes;

//insert at position 5;
//Steps
//First get the element to be inserted, say x
//Then get the position at which this element is to be inserted, say pos
//Create a new array with the size one greater than the previous size
//Copy all the elements from previous array into the new array till the position pos
//Insert the element x at position pos
//Insert the rest of the elements from the previous array into the new array after the pos

public class InsertElementInSortedArray {
	public static void main(String[] args) {
		int arr[]= {2,5,18,20,29,32,40};
		int modifiedArr[]=new int[arr.length+1];
		int x=22;
		int count=0;
		int pos=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<x) {
				modifiedArr[i]=arr[i];
			}else if(arr[i]>x && count==0){
				pos=i;
				count++;
				modifiedArr[i+1]=arr[i];
		    }else {
				modifiedArr[i+1]=arr[i];
		    }
	}
		modifiedArr[pos]=x;
		for(int b:modifiedArr) {
			System.out.print(b+" ");
		}
}}