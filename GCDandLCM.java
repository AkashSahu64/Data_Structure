import  java.util.*;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int orignaln1 = n1;
        int orignaln2 = n2;
        while (n1 % n2 != 0){
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        int gcd = n2;
        int lcm = (orignaln1 * orignaln2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
