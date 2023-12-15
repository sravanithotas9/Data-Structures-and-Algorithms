package coding.java;
public class BuyandSellStock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int ans=buySell ( arr );
        System.out.println (ans);

    }
    public static int buySell(int[] arr){

        //here we have to buy on day 2 i.e.., (price = 1) and sell on day 5 (price = 6)

        //profit = 6-1 =5.

        //not 7-1 =6,as selling price needs to be larger than buying price

        int min=Integer.MAX_VALUE; //min is the value

        int max=0; // max is the profit

        for (int i = 1; i < arr.length; i++) {

            if(arr[i] < min){
                min = arr[i];

            }else if(arr[i]-min > max){
                    max = arr[i]-min;
                }
            }

        return max;
    }

    }

