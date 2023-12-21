package coding.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {
        String str = "google";
        System.out.println ( reverse ( str ) );
    }

    public static String reverse(String str) {
        String rev = " ";

        if (str == null || str.length() == 0) {
            return null;
        }

        for (int i = str.length () - 1; i >= 0; --i) {

            rev = rev + str.charAt ( i );
        }
        return rev;
    }
}


