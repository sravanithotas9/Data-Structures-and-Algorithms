package coding.java;

import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args) {
        String str = "abcba", reverse = "";
        System.out.println ( isPalin (str) );
    }

    /*    Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter a string to check if it is a palindrome" );
        str = in.nextLine ();
        for (int i = str.length () - 1; i >= 0; i--) {

            reverse = reverse + str.charAt ( i );

            if (str.equals ( reverse )) {

                System.out.println ( "string is a palindrome." );
            } else {
                System.out.println ( "string is not a palindrome." );
            }
        }*/
        public static boolean isPalin(String str){
            if( str == null||str.length () == 0){
                return false;
            }
            for (int i = 0; i <=str.length () / 2; i++) {
                char start = str.charAt ( i );
                char end = str.charAt ( str.length () - 1 - i );
                if (start != end) {
                    return false;
                }

            }

            return true;
        }

    }




