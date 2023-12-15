import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str="aabbccc";

        HashMap<Character,Integer> map = new LinkedHashMap<> ();

        char[] array=str.toCharArray ();

        for (char ch:array) {

            if(map.containsKey ( ch )){

                map.put(ch,map.get(ch)+1);

            }else{
                map.put(ch,1);
            }

        }
        System.out.println (map);
        }

    }

