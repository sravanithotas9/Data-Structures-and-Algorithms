package coding.java;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HM_occurance_char_number {
    public static void main(String[] args) {
        String str = "aabbccc";
        System.out.println ( countNum ( str ) );
    }

    public static HashMap<Character, Integer> countNum(String str) {
        int count = 0;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<> ();

        for (int i = 0; i <str.length (); i++) {

            char ch = str.charAt ( i );

            if (map.containsKey ( ch )) {

                count = (map.get ( ch )) + 1;

                map.put ( ch, count );

            } else {
                map.put ( ch, 1 );
            }

        }
        return map;
    }
}



