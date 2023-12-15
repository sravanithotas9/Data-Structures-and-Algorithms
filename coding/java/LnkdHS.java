import java.util.HashSet;
import java.util.LinkedHashSet;

public class LnkdHS {
    public static void main(String[] args) {
        String str = "Dileep";
        System.out.println ( removeDuplicates( str ) );
    }
    public static String removeDuplicates(String str) {

        LinkedHashSet<Character> set = new LinkedHashSet<> ();

        char[] ch = str.toCharArray ();

        for (Character c : ch) {

            set.add ( c );
        }

        StringBuilder sb = new StringBuilder ();

        for (Character s : set) {

            sb.append ( s );
        }


        return sb.toString ();
    }
}

