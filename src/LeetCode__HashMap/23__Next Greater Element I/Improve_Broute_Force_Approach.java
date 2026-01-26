import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Improve_Broute_Force_Approach {
    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        int[] nextGreaterElement = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(nextGreaterElement));
    }

    public static int[] nextGreaterElement(int nums1[], int nums2[]) {
        int res[] = new int[nums1.length];   // bcz nums1 elements we have to found in nums2
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i], i);
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=map.get(nums1[i]); j<nums2.length;j++){   //we are starting tracing loop from where num1 element found in num2 array
                if(nums2[j]>nums1[i]){
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

// TC - O(n*n)
// SC - O(n)