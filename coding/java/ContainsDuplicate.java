package coding.java;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums ={2,3,3,6,2};
        System.out.println (contains(nums));

    }
    public static boolean contains(int[] nums){
        HashSet<Integer> set = new HashSet<> ();

        for (int i : nums) {

            if(set.contains( nums[i] )) {
                return true;
            }
            else{
                set.add ( nums[i] );
            }

        }
        return false;
    }
}
