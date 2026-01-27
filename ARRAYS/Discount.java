package ARRAYS;

import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int costWithoutCoupon = 0;
            int costWithCoupon = X; 
            
            for (int i = 0; i < N; i++) {
                int price = sc.nextInt();
                costWithoutCoupon += price;
                costWithCoupon += Math.max(0, price - Y);
            }

            if (costWithCoupon < costWithoutCoupon) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }

        sc.close();
    }
}
