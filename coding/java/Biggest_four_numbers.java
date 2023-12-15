package coding.java;

public class Biggest_four_numbers {
    public static void main(String[] args) {
        int a=3,b=45,c=32,d=10;
        System.out.println (biggestNum ( a,b,c,d ));
    }
    public static int biggestNum(int a,int b,int c,int d){

        if(a>b && a>c && a>d){
            System.out.println (a +"is greater");
        } else if (b>a && b>c && b>d){
            System.out.println (b +"is greater");
        } else if (c>a && c>b && c>d){
            System.out.println (c +"is greater");
        } else if(d>a && d>b && d>c){
            System.out.println (d +"is greater");
        }
        return -1 ;
    }
}
