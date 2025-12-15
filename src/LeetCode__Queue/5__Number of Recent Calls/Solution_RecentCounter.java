import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    // A queue to store the timestamps of the requests
    private final Queue<Integer> requests;

    public RecentCounter() {
        // Initialize the queue
        requests = new LinkedList<>();
    }

    /**
     * Adds a new request at time t, and returns the number of requests 
     * that have happened in the past 3000 milliseconds (inclusive range [t - 3000, t]).
     *
     * @param t The current timestamp in milliseconds.
     * @return The number of recent requests.
     */
    public int ping(int t) {
        // 1. Add the current timestamp to the end of the queue
        requests.offer(t);

        // 2. Remove timestamps from the front of the queue that are outside 
        // the [t - 3000, t] time window
        while (requests.peek() < t - 3000) {
            requests.poll(); // Remove the oldest, outdated request
        }

        // 3. The remaining size of the queue is the number of recent requests
        return requests.size();
    }
}

// Example Usage (for demonstration purposes, not part of the class itself):
public class Solution_RecentCounter {
    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();
        System.out.println(rc.ping(1));    // Output: 1 (requests: [1])
        System.out.println(rc.ping(100));   // Output: 2 (requests: [1, 100])
        System.out.println(rc.ping(3001));  // Output: 3 (requests: [1, 100, 3001])
        System.out.println(rc.ping(3002));  // Output: 3 (requests: [100, 3001, 3002] - time 1 is removed)
    }
}