package coding.java;

import java.util.ArrayList;
import java.util.Arrays;

public class LeaderProblem {
    public static void main(String[] args) {
        int[] arr={23,3,67,9,10,4};

        ArrayList<Integer> list = new ArrayList<> ();

        int max=arr.length;

        list.add(max);

        for (int i = arr.length-1; i >=0; i--) {

            if(arr[i]>max){

                list.add(arr[i]);

                max=arr[i];
            }
        }
        System.out.println (max);

    }
}
