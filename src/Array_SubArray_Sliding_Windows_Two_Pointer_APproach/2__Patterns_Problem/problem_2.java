/**
 * Print the following pattern for the given N number of Rows
 * N = 3
 *
 * 123
 * 123
 * 123
 *
 * N=5
 *
 * 12345
 * 12345
 * 12345
 * 12345
 * 12345
 */

public class problem_2 {
    public static void main(String[] args) {
        int N=4;
        printPattern(N);
    }

    private static void printPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
