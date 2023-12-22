package coding.java;

public class Smallest_second_number {
    public static void main(String[] args) {
        int[] arr={23,12,44,7,89};
        System.out.println (smallestnumber ( arr ));


}
public static int smallestnumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr[2];
    }
}

