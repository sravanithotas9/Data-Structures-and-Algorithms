import java.util.Scanner;

public class Fabbonicci {
    public static void main(String[] args) {
        Scanner sc =new Scanner ( System.in );

        int n1 = 1;
        int n2 = 1;
        int n3;
        int count = sc.nextInt ();
            for (int i = 2; i <= count; i++) {
                System.out.println (n2 + " ");
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }


        }
    }

