package coding.java;

public class Primes {
    public static void main(String[] args) {
        int n=7,m=n/2,flag=0;

        if(n==0||n==1){
            System.out.println(n+" is not prime number");

        }else{

            for(int i=2;i<=m;i++){

                if(n%i==0){
                    System.out.println(n+" is not prime number");

                    flag=1;

                    break;
                }
            }
            if(flag==0)  {
                System.out.println(n+" is prime number");
            }
        }

    }
}
