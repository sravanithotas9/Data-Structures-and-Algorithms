package coding.java;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ();
        multiples ( n );

    }
    static int multiples(int n){

        for (int i = 1; i <=10; i++) {

            System.out.println (n + " * "  + i+ " = " +n*i);

        }
        return n;
    }
}
