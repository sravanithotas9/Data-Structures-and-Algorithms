package coding.java;

public class Palindrome_Numbers {
    public static void main(String[] args) {


        for (int n = 1; n <= 100; n++) {
            int rem,rev = 0;

            int a = n;

            while (a > 0) {

                rem = a % 10;
                rev = (rev * 10) + rem;
                a = a / 10;
            }
            if (n == rev) {
                System.out.println ( n );

            }
        }
    }
}


