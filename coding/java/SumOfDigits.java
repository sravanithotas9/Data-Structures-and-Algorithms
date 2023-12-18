package coding.java;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 333;
        int ans= sumOfDigits(n);
        System.out.println (ans);

    }
    public static int sumOfDigits(int n){
        int sum =0,rem;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
}
