
public class QuickSort {

    public static void main(String[] args) {

        int nums[] = {5, 62, 2, 3, 11, 81, 4};
        int low = 0;
        int high = nums.length-1;
        System.out.println("\nBefore Sorting\n");
        for (int i:nums){
            System.out.print(i+" ");
        }

        quickSortOperation(nums, low, high);

        System.out.println("\nAfter Sorting\n");
        for (int i:nums){
            System.out.print(i+" ");
        }
    }

    private static void quickSortOperation(int[] nums, int low, int high) {

        if(low<high){
            int pi  = doPartition(nums, low, high);
            quickSortOperation(nums, low, pi-1);
            quickSortOperation(nums, pi+1, high);
        }
    }

    private static int doPartition(int[] nums, int low, int high) {
        int pivot = nums[high];

        System.out.println("\n\n pivot - "+nums[high]+"\n");
        int i = low-1;

        for(int j=low; j<high; j++) {
            if(nums[j]<=pivot){
                i++;
                swapTwoValues(nums, i, j);
            }
        }
        swapTwoValues(nums, i+1, high);

        for(int k:nums){
            System.out.print(k+" ");
        }

        return i+1;
    }

    private static void swapTwoValues(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
