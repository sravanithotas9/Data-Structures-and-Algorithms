import java.util.LinkedHashMap;

// Java program to create a unique String using unordered map
public class LnkdHM_RemovedDuplicates {
    public static void main(String[] args) {
        String str = "Dileep";
        System.out.println ( removeDuplicates( str ) );
    }
    public static String removeDuplicates(String str) {
        String st = " ";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<> ();
        for (int i = 0; i < str.length (); i++) {
            char ch = str.charAt ( i );
            if (!map.containsKey ( ch )) {
                st = st + ch;
                map.put ( ch, 1 );

            }
        }
        return st;
    }
}











