package Function;

import java.util.*;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(getProduct(b, n1, n2));

    }
    public static int getProduct(int b, int n1, int n2){
        int num = 0;
        int x = 1;
        while (n2 > 0){
            int r2 = n2 % 10;
            n2 = n2 / 10;
            int singleDigitProduct = getSingleDigitProduct(b, n1, r2);
            num = getSum(b, num, singleDigitProduct * x);
            x *= 10;
        }
        return num;
    }

    public static int getSingleDigitProduct(int b, int n1, int r2){
        int num = 0;
        int c = 0;
        int x = 1;
        while (n1 > 0 || c > 0){
            int r1 = n1 % 10;
            n1 = n1 / 10;
            int d = r1 * r2 + c;
            c = d / b;
            d  = d % b;
            num += d * x;
            x *= 10;
        }
        return num;
    }
    public static int getSum(int b, int n1, int n2){
        int num = 0;
        int c = 0;
        int x = 1;
        while (n1 > 0 || n2 > 0 || c > 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = r1 + r2 + c;
            c = d / b;
            d = d % b;
            num += d * x;
            x = x * 10;

        }
        return num;
    }
}