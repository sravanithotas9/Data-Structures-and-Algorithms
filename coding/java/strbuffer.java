public class strbuffer {
    public static void main(String[] args) {
        //it will give the size of a buffer by default it will give 16 characters when it is empty
        //it will give 16+5

        StringBuffer sb =new StringBuffer ( "navin");
        //STRING BUFFER
        //  it is mutable,is thread safe,synchronised
        //mostly we use string buffer instead of builder

        System.out.println (sb.capacity());

        System.out.println (sb.length ());

        sb.append(" redddy");
        System.out.println (sb);

        //here length is 5 so length and capacity are two different things
        //it will not convert string buffer to string
        //we can use tostring method to convert data from string buffer to string

        String str = sb.toString ();
        System.out.println (str);

        sb.insert ( 6,"java" );
        System.out.println (sb);

        sb.deleteCharAt ( 2 );
        System.out.println (sb);

    }
}
