/**
 * Print the following pattern for the given N number of Rows
 * N = 4
 * 1111
 * 2222
 * 3333
 * 4444
 *
 */

public class problem_3 {
    public static void main(String[] args) {
        int N = 4;
        printPattern(N);
    }

    private static void printPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j=1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
