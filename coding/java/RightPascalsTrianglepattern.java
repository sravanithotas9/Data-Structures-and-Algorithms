public class RightPascalsTrianglepattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <=n-1; i++) {
            for (int j = 3; j >=i-1; j--) {
                System.out.print ( "  " );
            }
            for (int j = 1; j <=i; j++) {
                System.out.print ( "* " );
            }
            System.out.println ();

        }
        for (int i = 3; i >=1; i--) {
            for (int j = 4; j >=i; j--) {
                System.out.print ( "  " );
            }
            for (int j = 1; j <=i; j++) {
                System.out.print ( "* " );
            }
            System.out.println ();

        }
    }
}

