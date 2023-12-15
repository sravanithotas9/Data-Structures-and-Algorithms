import java.util.Scanner;

public class Avg_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "enter n number" );
        int n =10;
        System.out.println (averageNum ( n ));

    }
    static  int averageNum(int n){
        int x =2;
        int avg,sum=0,count=1;

        while(count<=n) {

            sum = sum + x;
            count++;
        }
        avg=sum/n;

        return avg;

    }
}
