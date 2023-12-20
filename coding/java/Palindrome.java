package coding.java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in );
        int n= sc.nextInt ();
        int ans=palindrome(n);
        System.out.println (ans);

    }
    public static int palindrome(int n){

        int rem,rev=0;

        int a=n;

        while (n!=0){

            rem=n%10;

            rev=rev*10+rem;

            n=n/10;
        }
        if(a==n){
            System.out.println (a + "it is a palindrome");
        }else {
            System.out.println (a+ "it is not a palindrome");
        }
        return a;
    }
}
