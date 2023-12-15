package coding.java;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 16, 12, 7, 5, 3};
        bubble ( arr );
        System.out.println ( Arrays.toString ( arr ) );
    }

    public static int[] bubble(int[] arr) {
        boolean swapped;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;

                }


            }
            if (!swapped){

                break;
            }


        }
        return arr;

    }
}



