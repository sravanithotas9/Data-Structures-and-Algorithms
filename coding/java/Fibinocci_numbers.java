public class Fibinocci_numbers {
    public static void main(String[] args) {
        int n3,n1 =0,n2=1;
        for (int i = 2; i <=10 ; i++) {
            n3 = n1 + n2;
            if (n3 <= 100) {
                n1 = n2;
                n2 = n3;
            }

            System.out.println ( n3 );
        }
    }
}
