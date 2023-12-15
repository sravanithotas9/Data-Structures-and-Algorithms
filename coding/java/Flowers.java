package coding.java;

import java.util.HashMap;

public class Flowers {
    public static void main(String[] args) {
        String[] str = {"rose", "tuples", "jasmin", "tuples", "rose"};
        int ans =flower ( str );
        System.out.println (ans);

    }
    public static int flower(String[] str){
        int max =0;

        HashMap<String,Integer> map = new HashMap<> ();

        for (int i = 0; i < str.length ; i++) {

            if(map.containsKey ( str[i])){

                int start = map.get ( str[i] );

                int current_distance=i-start;

                max= Math.max ( max,current_distance );
            }
            map.put ( str[i],i );

        }
        return max;
    }
}
