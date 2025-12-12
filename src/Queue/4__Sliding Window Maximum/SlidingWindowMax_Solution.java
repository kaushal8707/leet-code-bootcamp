import java.util.ArrayDeque;
import java.util.Arrays;

public class SlidingWindowMax_Solution {

    public static int[] maxSlidingWindow(int[] nums, int k){
        int[] res = new int[nums.length - k +1];
        int j = 0;
        ArrayDeque<Integer> queue = new ArrayDeque();
        for(int i=0; i < nums.length; i++){
            while(!queue.isEmpty() && nums[queue.getLast()] < nums[i]){
                queue.removeLast();   // we will pop till current element is max of queue elements so 1st element will always be max so monotonic decreasing queue
            }
            queue.addLast(i);
            if(queue.getFirst() + k == i){
                queue.removeFirst();
            }
            if(i >= k - 1){
                res[j++] = nums[queue.getFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {  // i - 2
        int[] arr = {1,3,-1,-3,5,3,6,7};    //q -    1 2
        int k = 3;
        int[] maxSlidingWindow = maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(maxSlidingWindow));
    }
}
