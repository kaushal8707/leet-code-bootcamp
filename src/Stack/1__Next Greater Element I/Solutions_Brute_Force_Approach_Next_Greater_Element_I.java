import java.util.Arrays;

public class Solutions_Brute_Force_Approach_Next_Greater_Element_I {
    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        int[] nextGreaterElement = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(nextGreaterElement));
    }

    public static int[] nextGreaterElement(int nums1[], int nums2[]) {
        int res[] = new int[nums1.length];   // bcz nums1 elements we have to found in nums2
        boolean found = false;
        for(int i=0;i<nums1.length;i++){
            found = false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                }
                if(found && nums2[j]>nums1[i]){
                    res[i]=nums2[j];
                    break;
                }
            }
        }
       for(int i=0;i<res.length;i++){
           if(res[i]==0){
               res[i]=-1;
           }
       }
       return res;
    }
}

// TC - O(n * n)
// SC - O(1)
