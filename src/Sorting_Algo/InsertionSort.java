
public class InsertionSort {
    public static void main(String[] args) {

        int nums[] = {5,1,2,8,3,7,4,9,6};

        System.out.println("---Before sorting---");
        for(int num : nums) {
            System.out.print(num+" ");
        }
        System.out.println("\n\nsorting starts->\n");

        insertionSortOperation(nums);

        System.out.println("---After sorting---");
        for(int num : nums) {
            System.out.print(num+" ");
        }
    }

    private static void insertionSortOperation(int[] nums) {

        for(int i=1; i<nums.length; i++) {

            int key=nums[i];
            int j=i-1;

            while(j>=0 && nums[j]>key) {
                nums[j+1]=nums[j];
                j=j-1;
            }
            nums[j+1]=key;
        }
    }
}
