package Function;

import java.util.*;

public class AnyBaseToAnyBase {
    public static int decimalToAnyBase(int n, int b){
        int count = 0;
        int x = 1;
        while (n > 0){
            int r = n % b;
            n = n / b;
            count += r * x;
            x = x * 10;
        }
        return count;
    }
    public static int anyBaseToDecimal(int n, int b){
        int count = 0;
        int x = 1;
        while (n > 0){
            int r = n % 10;
            n = n / 10;
            count += r * x;
            x = x * b;
        }
        return count;
    }
    public static int getValue(int n, int b1, int b2){
        int dec = anyBaseToDecimal(n, b1);
        int dn = decimalToAnyBase(dec, b2);
        return dn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println(getValue(n, b1, b2));
    }
}
