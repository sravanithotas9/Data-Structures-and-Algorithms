import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8};
        int target = 13;
        System.out.println ( Arrays.toString ( twoSum ( nums, target ) ) );
    }
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        for (int i:nums) {
            int complement = target - nums[i];
            if (map.containsKey ( complement )) {
                return new int[] {map.get(complement ), i};
              /* Explanation of return new int[] in detail
               int[] x =new int[2];
                x[0] = map.get (complement );
                x[1] =i;
                return x;*/
            } else {
                map.put (nums[i], i );
            }
        }
        return new int[]{-1, -1};
    }
}
