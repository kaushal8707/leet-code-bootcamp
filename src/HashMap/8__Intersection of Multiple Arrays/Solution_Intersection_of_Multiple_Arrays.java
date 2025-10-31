import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution_Intersection_of_Multiple_Arrays {
    public static void main(String[] args) {
        int[][] nums = {{3,1,2,4,5}, {1,2,3,4}, {3,4,5,6}};
        int[][] nums1 = {{1,2,3,4}, {5,6,7}};

        List<Integer> intersectionResult = intersection(nums);
        System.out.println(intersectionResult);

    }

    private static List<Integer> intersection(int[][] nums){
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] arr : nums){
            for(int i : arr){
                map.put(i, map.getOrDefault(i,0) + 1);
            }
        }
        return map.keySet().stream().filter(key -> map.get(key) == n)
                .sorted().collect(Collectors.toList());
    }
}
