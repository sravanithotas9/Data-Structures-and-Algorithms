package coding.java;

import java.util.Arrays;

public class strbulid {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder ();

        String str = "abc test";

        for (int i = 0; i < 26; i++) {

            char ch = (char) ('a' + i);

            //it is mutable like string it is not as immutable
            //by using this appends it will change the object means it update the output within it instead of creating new string reference

            sb.append ( ch );
        }
        System.out.println ( sb );
        sb.append ( str );

        sb.append ( "xyz" );
        sb.reverse ();

        System.out.println ( sb );
        System.out.println ( Arrays.toString ( str.toCharArray () ) );

        System.out.println (str.toUpperCase ());

        System.out.println (str.length ());

        System.out.println (Arrays.toString (str.split ( " " )));

        System.out.println (str.indexOf ('r'));

        System.out.println ("    minnu   ".strip ());

        System.out.println (str.replace ( 'r' ,'z'));

    }
}