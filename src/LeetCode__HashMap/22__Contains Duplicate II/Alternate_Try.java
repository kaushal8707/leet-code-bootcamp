import java.util.HashMap;
import java.util.Map;

/** Contains Duplicate II  */

        class Alternate_Try {
            public static void main(String[] args) {
                int[] nums = {1,0,1,1};
                int k = 1;
                boolean containsDuplicateII = containsDuplicateII(nums, k);
                System.out.println(containsDuplicateII);
            }

            private static boolean containsDuplicateII(int[] nums, int k) {
                Map<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < nums.length; i++) {
                    if (map.containsKey(nums[i])) {
                        if (Math.abs(i - map.get(nums[i])) <= k) {
                            return true;
                        }
                    }
                    map.put(nums[i], i);
                }
                return false;
            }
    }
