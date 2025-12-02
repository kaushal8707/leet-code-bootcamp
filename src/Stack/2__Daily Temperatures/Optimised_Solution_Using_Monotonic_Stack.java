import java.util.Arrays;
import java.util.Stack;

public class Optimised_Solution_Using_Monotonic_Stack {
    public static void main(String[] args) {
            int tem[] = {73, 74, 75, 71, 69, 72, 76, 73};
            int[] dailyTemperatures = findDailyTemperatures(tem);
            System.out.println(Arrays.toString(dailyTemperatures));
    }

    public static int[] findDailyTemperatures(int[] t){
        int[] res = new int[t.length];
        // Stack stores indices of the days
        Stack<Integer> stack = new Stack<>();
        // Iterate through each day/index
        for(int i=0; i<t.length; i++){
            // While the stack is not empty and the current temperature is warmer than the temperature
            // at the index stored at the top of the stack
            while(!stack.empty() && t[i] > t[stack.peek()]){   // when current temperature is greater than top of stac kelement which mean remove that element because we are going to put the answer
                // Pop the previous day's index from the stack
                Integer prevDayIndex  = stack.pop();
                // Calculate the wait time (current day index - previous day index)
                res[prevDayIndex] = i - prevDayIndex;
            }
            stack.push(i); // when stack is empty for initial case push element
                            // pushing array index into a stack
        }
        return res;
    }
}
// TC - This can be efficiently solved using a monotonic stack (specifically, a decreasing stack) in O(n) time complexity.


