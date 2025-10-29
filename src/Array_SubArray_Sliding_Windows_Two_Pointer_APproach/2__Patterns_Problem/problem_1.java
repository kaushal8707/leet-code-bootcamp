/**
 * Print the following pattern for the given N number of Rows
 * N = 4
 * 4444
 * 4444
 * 4444
 * 4444
 *
 */
public class problem_1 {
    public static void main(String[] args) {
        //no. of row
        //every row how many no. of column
        //what to print
        int N = 4;
        printPattern(N);
    }

    public static void printPattern(int n) {
        for(int i=0;i<4;i++){               /** row */
            for(int j=0;j<4;j++){           /** column */
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
