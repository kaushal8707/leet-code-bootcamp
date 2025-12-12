
/**
 *
 * by default, you are making first element as a minimumIndex
 * trying to find a minimum element from an entire array
 * once you find a minimum element then you swap with your start position elements which is in outer-oop
 * so, minIndex is start denoting once you find min element from array will point to min element.
 *
 */
public class SelectionSort {
    public static void main(String[] args) {

        int nums[] = {5,1,2,8,3,7,4,9,6};

        System.out.println("\n----Before Sorting----\n");
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println("\n sorting start\n\n");
        selectionSortOperation(nums);
        System.out.println("\n----After Sorting----\n");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    private static void selectionSortOperation(int[] nums) {

        int minIndex = -1;
        int temp=0;

        for(int i=0; i<nums.length-1; i++) {
            minIndex=i;

            for(int j=i+1; j<nums.length; j++) {

                if(nums[j] < nums[minIndex]) {
                    minIndex=j;
                }
            }

            //once find min element swap with outer-loop iterating position start with oth index

            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;

            System.out.println();
            for(int n:nums){
                System.out.print(n+" ");
            }
        }
    }
}
