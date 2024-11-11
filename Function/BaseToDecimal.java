package Function;

import java.util.*;

public class BaseToDecimal {
    public static int baseToDecimal(int n, int b){
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
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int b= sc.nextInt();
        System.out.println(baseToDecimal(n, b));
    }
}
