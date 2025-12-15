import java.util.Arrays;
import java.util.Stack;


public class Solution_Final_Prices_With_Special_Discount_Shop {
    public static void main(String[] args) {
        int prices[] = {8,4,6,2,3};
        int[] finalPrices = finalPrices(prices);
        System.out.println(Arrays.toString(finalPrices));
    }

    public static int[] finalPrices(int[] prices){
        Stack<Integer> stack = new Stack();
        int resArr[] = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[i] <= prices[stack.peek()]){
                Integer idx = stack.pop();
                resArr[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
        }
                            //stack will be full with those elements whose answer not found i.e m increasing stack
        while(!stack.isEmpty()){
            Integer idx = stack.pop();
            resArr[idx] = prices[idx];
        }
        return resArr;
    }
}

// TC & SC - O(n)
