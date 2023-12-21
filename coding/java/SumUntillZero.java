package coding.java;

import java.util.Scanner;

public class SumUntillZero {
    public static void main(String[] args) {
        int n =1;
        int ans=sumOfZero(n);
        System.out.println (ans);
    }
    public static int sumOfZero(int n){
        Scanner sc=new Scanner ( System.in );
        int sum =0;
        while(n!=0){
            n =sc.nextInt ();
            sum =sum+n;
        }
        return sum;
    }
}
