package coding.java;

public class Count_given_numbers {
    public static void main(String[] args) {
        int num =12345;
        int count=0;
        while(num!=0) {
            num = num / 10;
            count++;
        }
            System.out.println (count);

        }
    }

