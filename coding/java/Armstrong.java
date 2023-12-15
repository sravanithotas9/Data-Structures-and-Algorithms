package coding.java;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );

        System.out.println ( "enter a n number" );

        int n = sc.nextInt ();
        System.out.println (armstrongNum ( n ));

    }
    static int armstrongNum(int n){
        int n2, rem,res=0;

        n2=n;

        while(n2!=0){

            rem = n2%10;
            res = res+(rem*rem*rem);
            n2=n2/10;
        }
        if (res == n){
            System.out.println (n +  " it is an armstrong number");
        }else {
            System.out.println (n + " it is not an armstrong number");
        }
        return n;
    }
}
