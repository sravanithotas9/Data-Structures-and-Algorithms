package coding.java;

public class strbld_str {
    public static void main(String[] args) {

        //EXAMPLE OF STRING AND STRING BULIDER


        //STRING
        // strings are immutable,every time we change the value are perform any kind of operations that may change on them,it
        // creates a new string in memory where this information or changed is stored
        //a new string was created in the memory to store the newly generated value,but this created string was never used in this
        //example,therefore,to retrieve the created string we will have to store the result of the concatenation inside a new string reference,


        //STRING BULIDER
        //string builder is mutable,any change induced will modify the existing sequence of characters created by the stringbulider in the memory
        // is not threadsafe,not synchronised,it will not work for multithread environments unless you make it
        //mutable is about to modify the stringbulider,the existing value in the memory was modified as well,
        //the existing value in the memory,was modified to the new value






        //where to use STRING AND STRING BUILDER
        //REVERSING A STRING
        //loop over the characters of a given string in reverse order while storing these characters in a new variable
        //here from above the question is whether we can use string or string builder?
        //if we use string -->string.concat() method or sign '+'....here rev string the complexity is 0(n^2)

        String str ="like";
        str.concat ( "and subscribe" );


        StringBuilder sb = new StringBuilder ("like");
        sb.append ( " and subscribe" );
        System.out.println (str + " | "  + sb);




    }
}
