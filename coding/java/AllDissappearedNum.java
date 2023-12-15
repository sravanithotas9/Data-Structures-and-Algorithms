package coding.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AllDissappearedNum {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6,3,8, 2, 3};
        System.out.println (findDisappearedNumbers ( arr ));

    }

    /* public static int allDissappeared(int[] arr) {
          Arrays.sort ( arr );
          int i = 1, num = 0;
          while (i < arr.length) {

              if (arr[i] - arr[i - 1] == 1) {

              } else {
                  num = arr[i - 1] + 1;

              }
              i++;

          }

         return num;
     }
  }*/
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> result = new ArrayList<> ();

        for (int n : arr) {
            int i = Math.abs(n)-1;
            if (arr[i] > 0) {
                arr[i] =-arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result.add(i+1);
            }
        }

        return result;
    }
}






