
public class Solution_Find_Lucky_Integer_In_An_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3}; // {2,2,2,3,3} -> false
        int arr1[] = {2,2,2,3,3};
        int lucky = findLucky(arr);
        System.out.println(lucky);
    }

    private static int findLucky(int[] arr) {
        int[] ca = new int[501];
        for(int count: arr){
            ca[count]++;
        }
        for(int i = ca.length-1; i > 0;i--){
            if(ca[i] == i)
                return i;
        }
        return -1;
    }
}
