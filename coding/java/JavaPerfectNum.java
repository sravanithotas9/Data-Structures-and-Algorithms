import java.util.Scanner;

public class JavaPerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ();
        int ans =perfectnum(n);
        System.out.println (ans);

    }

    public static int perfectnum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {


            if (n % i == 0) {


                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println ( n + " it is a perfect number" );
        } else {
            System.out.println ( n + "it is not a perfect number" );
        }
        return sum;
    }
}
