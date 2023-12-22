package coding.java;

public class Max_second_Number {
    public static void main(String[] args) {
        int[] arr={23,12,44,7,89};
        System.out.println (maxnumber ( arr ));

    }

    public static int maxnumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr[arr.length-2];
    }
}
