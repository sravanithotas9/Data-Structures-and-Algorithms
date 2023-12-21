package coding.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AllDissappearedNum {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println ( findDisappearedNumbers ( arr ) );
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> result = new ArrayList<> ();

        for (int nums : arr) {
            int index = Math.abs ( nums ) - 1;
            if (arr[index] > 0) {
                arr[index] = -arr[index];
            }
        }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    result.add ( i + 1 );
                }
            }

            return result;

    }
}











