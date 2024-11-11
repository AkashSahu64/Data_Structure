package Function;

import java.util.*;

public class DigitFrequency {
    public static int frequency(int n, int d){
        int count = 0;
       while (n > 0){
           int r = n % 10;
           n = n / 10;
           if( r == d){
               count++;
           }
       }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = frequency(n, d);
        System.out.println(f);
    }
}
