import java.util.HashSet;

public class RemoveRepeatedChar {
    public static void main(String[] args) {
        String str="aabcdd";
        System.out.println (removeReapeated ( str ));

    }
    public static Character removeReapeated(String str){
        HashSet<Character> set =new HashSet<> ();
        for (int i = 0; i < str.length (); i++) {
            Character ch= str.charAt ( i );
            if(set.contains ( ch )){
                return ch;

            }else{
                set.add(ch);
            }

        }
        return null;
    }
}
