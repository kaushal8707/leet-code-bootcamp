import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class OptimiseSolutions_MonotonicStack_HashMap {
    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        int[] nextGreaterElement = findNextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(nextGreaterElement));
    }

    public static int[] findNextGreaterElement(int nums1[], int nums2[]) {

        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<nums2.length; i++){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for(int i : stack){
            map.put(i, -1);
        }
        for(int i=0; i<nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
