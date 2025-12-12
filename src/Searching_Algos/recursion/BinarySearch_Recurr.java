package recursion;

public class BinarySearch_Recurr {
    private static int steps=0;

    public static void main(String[] args) {

        int numbers[] = {5,7,9,12,14,16,18,20,23,24,35};
        int target = 7;

        int leastElement=0;
        int mostElement=numbers.length-1;

        int result = binarySearchOperations(numbers, target, leastElement, mostElement);
        if(result != -1) {

            System.out.println(target+" found at position "+result);
        } else {

            System.out.println(target+" Not Found ");
        }
    }

    private static int binarySearchOperations(int[] numbers, int target, int leastElement, int mostElement) {

        //this is recursive so can't use while loop here

        if(leastElement<=mostElement) {
            steps++;
            int mid=(leastElement+mostElement)/2;

            if(numbers[mid]==target) {
                System.out.println("Number of Steps Taken By Binary - "+steps);
                return mid+1;
            } else if(numbers[mid]<target) {
                return binarySearchOperations(numbers, target, mid+1, mostElement);
            } else {
                return binarySearchOperations(numbers, target, leastElement, mid-1);
            }
        }
        System.out.println("Number of Steps Taken By Binary - "+steps);
        return -1;
    }
}
