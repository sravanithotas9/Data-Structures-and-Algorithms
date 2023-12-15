import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ();
        System.out.println (evenNum ( n ));

    }
    static int evenNum(int n){
        if(n%2==0){
            System.out.println ("n is even");
        }else{
            System.out.println ("n is odd");
        }
        return n;
    */


//counting no of even odd numbers in an array
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println ( "Even Numbers:"+ a[i] );

            }else{
                System.out.println ( "Odd Numbers:" + a[i]);
            }

            }
        }
    }


