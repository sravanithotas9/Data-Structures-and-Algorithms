package coding.java;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );

        System.out.println ( "enter the price" );

        int price = sc.nextInt ();

        System.out.println (discountPrice ( price ));

    }

    static int discountPrice(int price) {

        int costpaid = 0, discount;

        if (price <= 800) {
            costpaid = price;

        } else if (price > 800 && price <= 1000) {

            discount = (price * 10) / 100;
            costpaid = price - discount;

        } else if (price > 1000 && price <= 1500) {

            discount = (price * 20) / 100;
            costpaid = price - discount;

        } else if (price > 1500 && price <= 2000) {

            discount = (price * 25) / 100;
            costpaid = price - discount;
        }

        return costpaid;

    }


}
