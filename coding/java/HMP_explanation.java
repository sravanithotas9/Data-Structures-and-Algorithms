package coding.java;

import java.util.*;

public class HMP_explanation {
    public static void main(String[] args) {

        // no order - no  indexing
        // stores values --Key-Value <k,v>
        //key can not be duplicate
        //can store n number of null values but only one null key
        //hashmap is not synchronised,it is not thread safe
        //hashtable is synchronised

        HashMap<String, String> capitalMap = new HashMap<> ();
        capitalMap.put ( "india", "new delhi" );
        capitalMap.put ( "usa", "washington dc" );
        capitalMap.put ( "uk", "london" );
        capitalMap.put ( "uk", "london 11" );
        capitalMap.put ( null, "bothell" );
        capitalMap.put ( null, "warangal" );
        capitalMap.put ( "russia", null );
        capitalMap.put ( "france", null );
        capitalMap.remove ( "france" );


        System.out.println ( capitalMap.get ( "india" ) );

        //in above uk is duplicate hashmap cannot allow duplicates so it take latest value and overwrites the old value with new one,
        // it will not give error but override

        System.out.println ( capitalMap.get ( "uk" ) );

        System.out.println ( capitalMap.get ( null ) );
        System.out.println ( capitalMap.get ( "france" ) );
        System.out.println ( capitalMap.get ( "russia" ) );


        //Iterator
        //here we can iterate through keyset for all keys and value for all values
        //iterator returns set
        //we cannot use iterator method directly in hashmap because it is not available


        Iterator<String> it = capitalMap.keySet ().iterator ();
        while (it.hasNext ()) {
            String key = it.next ();
            String value = capitalMap.get ( key );
            System.out.println ( "key=" + key + " | " + "value =" + value );
        }

        System.out.println ( "------------------------------------------------" );


        //Iterator : over the set (pair) : by using entryset

        Iterator<Map.Entry<String, String>> itr = capitalMap.entrySet ().iterator ();

        while (itr.hasNext ()) {
            Map.Entry<String, String> entry = itr.next ();
            System.out.println ( "kay = " + entry.getKey () + " and value = " + entry.getValue () );

        }

        System.out.println ( "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );


        //Iterator hashmap using java 8 for each and lambda :

        capitalMap.forEach ( (k, v) -> System.out.println ( "key = " + k + " and value =" + v ) );


        HashMap<Integer, String> map1 = new HashMap<> ();

        map1.put ( 1, "A" );
        map1.put ( 2, "B" );
        map1.put ( 3, "C" );
        map1.put ( 3, "D" );

        HashMap<Integer, String> map2 = new HashMap<> ();

        map2.put ( 3, "C" );
        map2.put ( 1, "A" );
        map2.put ( 2, "B" );

        HashMap<Integer, String> map3 = new HashMap<> ();

        map3.put ( 1, "A" );
        map3.put ( 2, "B" );
        map3.put ( 3, "C" );

        //on the basis of key-value : use equals method:
        System.out.println ( map1.equals ( map2 ) );
        System.out.println ( map1.equals ( map3 ) );

        //compare hashmaps for same keys:keyset():
        System.out.println ( map1.keySet ().equals ( map2.keySet () ) );
        System.out.println ( map1.keySet ().equals ( map3.keySet () ) );


        //find out extra keys:
        HashMap<Integer, String> map4 = new HashMap<> ();
        map4.put ( 1, "A" );
        map4.put ( 2, "B" );
        map4.put ( 3, "C" );
        map4.put ( 4, "D" );


        //combine the keys from both the maps: using Hashset:
        HashSet<Integer> combineKeys = new HashSet<> ( map1.keySet () );


        //add the keyset from map4:
        combineKeys.addAll ( map4.keySet () );
        combineKeys.removeAll ( map1.keySet () );

        System.out.println ( combineKeys );

        //compare maps by values:
        HashMap<Integer, String> map5 = new HashMap<> ();

        map5.put ( 1, "A" );
        map5.put ( 2, "B" );
        map5.put ( 3, "C" );


        HashMap<Integer, String> map6 = new HashMap<> ();

        map6.put ( 4, "A" );
        map6.put ( 5, "B" );
        map6.put ( 6, "C" );


        HashMap<Integer, String> map7 = new HashMap<> ();

        map7.put ( 1, "A" );
        map7.put ( 2, "B" );
        map7.put ( 3, "C" );
        map7.put ( 4, "C" );


        //duplicates are not allowed:
        System.out.println (new ArrayList<> (map5.values ()).equals ( new ArrayList<> (map6.values ()) ) );
        System.out.println (new ArrayList<> (map5.values ()).equals ( new ArrayList<> (map7.values ()) ) );

        //duplicates are allowed:using hashset
        System.out.println (new HashSet<> (map5.values ()).equals ( new HashSet<> (map6.values ())));
        System.out.println (new HashSet<> (map5.values ()).equals ( new HashSet<> (map7.values ())));

    }
}
