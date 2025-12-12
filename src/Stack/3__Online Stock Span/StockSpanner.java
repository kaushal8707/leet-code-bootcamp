import java.util.Stack;

public class StockSpanner {
    // Stack to store pairs of (price, span)
    private Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    public int next(int price){
        int span = 1;
        // While the stack is not empty and the previous price
        // is less than or equal to the current price
        while(!stack.isEmpty() && price > stack.peek()[0]){
            // Add the span of the previous day(s) to the current span
            span += stack.pop()[1];
        }
        // Push the current price and its accumulated span onto the stack
        stack.push(new int[]{price, span});

        return span;
    }

    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(100)); // Output: 1
        System.out.println(stockSpanner.next(80));  // Output: 1
        System.out.println(stockSpanner.next(60));  // Output: 1
        System.out.println(stockSpanner.next(70));  // Output: 2
        System.out.println(stockSpanner.next(60));  // Output: 1
        System.out.println(stockSpanner.next(75));  // Output: 4
        System.out.println(stockSpanner.next(85));  // Output: 6
    }
}

//This approach ensures that each price is pushed and popped from the stack at most once, leading to an amortized O(1)
// time complexity per call.

//TC - every call of a next() is O(1) for our algo for cond:  while(!stack.isEmpty() && price > stack.peek()[0]){ suppose n time only will execute
//suppose for last element in worst case for TC we are just popping all n elelemnt but that will be worst case so on and avg case will be O(1) bcz we are popping and pushing

//SC - for use case 100,99,98,97,1 suppose at the end we are just pushing and pushing the elements in to a stack we are not popping so
//       sc will be O(n)