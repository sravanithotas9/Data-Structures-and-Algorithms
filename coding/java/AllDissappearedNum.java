package coding.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
	Find All Numbers Disappeared in an Array

	Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

	Find all the elements of [1, n] inclusive that do not appear in this array.

	Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

	Example:

	Input:
		[4,3,2,7,8,2,3,1]

	Output:
		[5,6]

	Logic:
1.The basic idea is that we iterate through the input array and mark elements as negative using nums[nums[i] -1] = -nums[nums[i]-1].In this way all the numbers that we have seen will be marked as negative.

2.	In the second iteration, if a value is not marked as negative, it implies we have never seen that index before, so just add it to the return list.
*/

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











