
public class LinearSearch {
    public static void main(String[] args) {

        int numbers[] = {5,7,9,12,14,16,18,20,23,24,35};
//        int numbers[] = new int[100];
        int target = 26;

        int searchResult = linearSearchOperation(numbers, target);
        if(searchResult!=-1) {
            System.out.println("Search Target "+target+" Found at position "+(searchResult));
        } else {
            System.out.println("Search Target " +target+" Not Found");
        }
    }

    private static int linearSearchOperation(int[] numbers, int target) {

        int steps=0;
        for(int i=0; i<numbers.length; i++) {
            steps++;
            if(numbers[i] == target) {
                System.out.println("Number of Steps Taken By Linear - "+steps);
                return (i+1);
            }
        }
        System.out.println("Number of Steps Taken By Linear - "+steps);
        return -1;
    }
}
