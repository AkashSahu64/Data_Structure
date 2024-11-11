package Function;

import java.util.*;

public class AnyBaseSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(anyBaseSubstraction(n1, n2, b));
    }

    public static int anyBaseSubstraction(int n1, int n2, int b){
        int num = 0;
        int c = 0;
        int x = 1;
        while (n2 > 0){
            int r1 = n1 % 10;
            n1 = n1 / 10;
            int r2 = n2 % 10;
            n2 = n2 / 10;
            int d = 0;
            r2 = r2 + c;
            if (r2 >= r1){
                c = 0;
                d  = r2 - r1;
            }else {
                c = -1;
                d  = r2 + b - r1;
            }
            num += d * x;
            x = x * 10;
        }
        return num;
    }
}
