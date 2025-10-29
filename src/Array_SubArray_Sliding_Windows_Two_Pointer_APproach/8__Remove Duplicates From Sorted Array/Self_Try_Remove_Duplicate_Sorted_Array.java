
public class Self_Try_Remove_Duplicate_Sorted_Array {
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,2,3,4,4,5,5,5,6,6};
        int pointer = removeDuplicateSortedArray(arr);
        for(int i=0;i<=pointer;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeDuplicateSortedArray(int[] arr) {

        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){   // if i th element same as a previous element then just increase i and no action need to perform
                j++;              // if i found unique from previous then increase unique value index j and copy i th element to jth index
                arr[j]=arr[i];    //copy i th element to jth index
            }
        }
        return j;
    }
}
