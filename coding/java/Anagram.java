package coding.java;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println ( isAnagram ( str1, str2 ) );
    }
    public static boolean isAnagram(String str1, String str2) {
       int CharacterRange = 256;
       if (str1.length ()!= str2.length ()) {
            return  false;
        }
        int count[] = new int[CharacterRange];
        for (int i = 0; i < str1.length (); i++) {
            count[str1.charAt ( i )]++;
            count[str2.charAt ( i )]--;
        }
        for (int i = 0; i < CharacterRange ; i++) {
            if(count[i]!=0){
                return false;
            }

        }
        return  true;
    }
}
