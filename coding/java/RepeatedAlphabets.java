import java.util.HashMap;

public class RepeatedAlphabets {
    public static void main(String[] args) {
        String str ="aabbbcccc";
        System.out.println (repeatedAlpha ( str ));


    }
    public static String repeatedAlpha(String str){
        String result=" ";
        HashMap<Character,Integer> map =new HashMap<> ();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt ( i );
            if (map.containsKey ( ch )) {
                int count = (map.get ( ch ))+1;
               //to increment the character number
                map.put ( ch, count );
            } else {
                map.put ( ch, 1 );

            }
        }
        for (Character key: map.keySet ()){
            result = result+key+map.get(key);//key will give string and get(key) give the integer value


        }
        return result;
    }
}
