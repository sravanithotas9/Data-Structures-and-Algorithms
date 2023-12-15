public class UpperLowerNUmber {
    public static void main(String[] args) {
        String str = "HeLlo WELcome @32#45";
        String x = " ";
        String y = " ";
        String z = " ";
        String s = " ";

        for (int i = 0; i < str.length (); i++) {

            char ch = str.charAt ( i );

            if (ch >= 'a' && ch <= 'z') {
                x = x + str.charAt ( i );
            }
            if (ch >= 'A' && ch <= 'Z') {
                y = y + str.charAt ( i );
            }
            if (ch >= '1' && ch <= '9') {
                z = z + str.charAt ( i );
            } else {
                s = s + str.charAt ( i );
            }
        }
        System.out.println ( x );
        System.out.println ( y );
        System.out.println ( z );
        System.out.println ( s );

        }
    }


