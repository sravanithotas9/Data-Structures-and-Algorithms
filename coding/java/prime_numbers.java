package coding.java;

public class prime_numbers {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            int count = 0;
            String prime = " ";

            for (int j = i; j >= 1; j--) {


                if (i % j == 0) {
                     count++;
                }

            }
            if (count == 2) {
                prime = prime + i ;


                System.out.println ( prime );

            }
        }
    }
}
