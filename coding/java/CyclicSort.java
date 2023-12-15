import java.util.Arrays;

/*if given number range is (1,N) or (0,N  ) follow cyclic sort algorithm
* here cyclic sort is swapping with i of first index checking i(o) index number then it is not in same element then swap
* cyclic sort is to check the index number is correct at the element n=if not swap with correct index
* time complexity is 0(N)
* */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6,2,4};
        sort(arr);
        System.out.println ( Arrays.toString (arr));
    }
    static  void sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap ( arr, i, correct );
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

            }
}
