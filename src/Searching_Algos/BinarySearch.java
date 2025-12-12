
public class BinarySearch {
    public static void main(String[] args) {

        int numbers[] = {5,7,9,12,14,16,18,20,23,24,35};
//        int numbers[] = new int[100];
        int target = 38;

        int searchResult = binarySearchOperation(numbers, target);
        if(searchResult != -1) {
            System.out.println("Target Element "+target+" found at place "+searchResult);
        } else {
            System.out.println("Target Element not found !!");
        }

    }

    private static int binarySearchOperation(int[] numbers, int target) {

        int leastNum = 0;
        int mostNum = numbers.length-1;
        int steps = 0;

        while(leastNum<=mostNum) {
            steps++;

            int mid = (leastNum+mostNum)/2;
            if(numbers[mid]==target) {
                System.out.println("Number of Steps Taken By Binary - "+steps);
                return mid;
            } else if( numbers[mid] < target) {
                leastNum = mid+1;
            } else {
                mostNum = mid-1;
            }
        }
        System.out.println("Number of Steps Taken By Binary - "+steps);
        return  -1;
    }
}
