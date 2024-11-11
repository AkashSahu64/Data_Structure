package Function;

import java.util.*;

public class DecimalToBase {
    public static int decimalToBase(int n, int b){
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = decimalToBase(n, b);
        System.out.println(d);
    }
}
