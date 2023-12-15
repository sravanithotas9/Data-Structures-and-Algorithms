public class Number_Upper_Lower_number_symbols {
    public static void main(String[] args) {
        String str = "The COMPUTER 34%^89@!7";
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;



         for (int i = 0; i < str.length (); i++) {
            char ch = str.charAt ( i );

            if ( ch>='A' && ch<='Z') {
                count++;
            }
            if (ch >= 'a' && ch <= 'z'){
                count1++;
            }
             if (ch >= '1'&& ch <= '9'){
                 count2++;
             } else{
                 count3++;
             }
        }
        System.out.println ( "uppercase"+count  );
        System.out.println ( "lowercase"+ count1 );
        System.out.println ( "numbers"+ count2 );
        System.out.println ( "symbols"+ count3 );
    }
}
