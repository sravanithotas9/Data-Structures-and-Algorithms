package coding.java;

import java.util.Arrays;

public class MovingZeros {
    public static void main(String[] args) {
        int[] nums={34,0,0,9,8,7,0,2};
        System.out.println ( Arrays.toString (movingZeros ( nums )));

    }
    public static int[] movingZeros(int[] nums){
        int insertposition =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertposition] = nums[i];
                insertposition++;

            }
        }
            while(insertposition < nums.length){
                nums[insertposition]=0;
                insertposition++;

            }

        return nums;
    }
}
