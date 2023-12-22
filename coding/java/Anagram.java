package coding.java;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println ( isAnagram ( s1, s2 ) );
    }
    public static boolean isAnagram(String s1, String s2) {

        int[] chars = new int[256];

    if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
        chars[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
        chars[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (chars[i] != 0) {
            return false;
        }
        }
        return true;
        }
        }

        /*
       int Chars = 256;
       if (s1.length ()!= s2.length ()) {
            return  false;
        }
        int count[] = new int[Chars];
        for (int i = 0; i < s1.length (); i++) {
            count[s1.charAt ( i )]++;
            count[s2.charAt ( i )]--;
        }
        for (int i = 0; i < Chars ; i++) {
            if(count[i]!=0){
                return false;
            }

        }
        return  true;
    }
}
*/

