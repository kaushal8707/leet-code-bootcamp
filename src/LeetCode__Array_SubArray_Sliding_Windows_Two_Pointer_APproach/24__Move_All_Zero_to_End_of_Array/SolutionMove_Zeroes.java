public class SolutionMove_Zeroes {
    public void moveZeroes(int[] nums) {
        // Pointer 'j' tracks the position for the next non-zero element
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            // When we find a non-zero element
            if (nums[i] != 0) {
                // Swap it with the element at the current 'j' position
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move 'j' to the next position
                j++;
            }
        }
    }

    public static void main(String[] args) {
        SolutionMove_Zeroes sol = new SolutionMove_Zeroes();
        int[] arr = {0, 1, 0, 3, 12};
        sol.moveZeroes(arr);

        // Output: [1, 3, 12, 0, 0]
        for (int num : arr) System.out.print(num + " ");
    }
}