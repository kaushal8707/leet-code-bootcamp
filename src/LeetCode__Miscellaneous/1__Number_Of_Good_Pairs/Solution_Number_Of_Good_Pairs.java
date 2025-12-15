public class Solution_Number_Of_Good_Pairs {
    public static void main(String[] args) {
        int numIdenticalPairs = numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        System.out.println(numIdenticalPairs);
    }

    private static int numIdenticalPairs(int[] num) {
        int res = 0;
        int[] countArray = new int[101];
        for(int i : num){
            countArray[i]++;
        }
        for(int count : countArray){
            count = count * (count - 1) / 2;
            res += count;
        }
        return res;
    }
}
