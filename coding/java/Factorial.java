import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ();
        System.out.println (factorial ( n ));

    }

        static int factorial (int n){
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
                System.out.println ( "factorial of" + n + " is " + fact );
            }
            return fact;


        }
    }

